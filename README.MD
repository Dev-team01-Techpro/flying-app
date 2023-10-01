# Uçak Projesi

Bu proje, bir uçak rezervasyon sistemi oluşturmayı amaçlayan bir Java uygulamasını tanımlar. Proje, Ekonomi ve Business sınıf seçenekleri sunar, koltuk numaralarını izler, yemek menüsü sunar ve bagaj hakkı ile ilgili hesaplamalar yapar.

## Özellikler

### Airplane (Uçak)

[//]: # (- `flightNumber`: Uçak numarasını temsil eden bir dize.)
- `destination`: Uçak destinasyonunu(guzerah) temsil eden bir dize.
- `price`: Uçak bilet fiyatını temsil eden bir ondalık sayı.
- `isBusinessClass`: Uçuşun Business Class mı yoksa Ekonomi Class mı olduğunu belirten bir boolean.
- `seatMap`: Koltukların düzenini temsil eden bir dizi. Map kullanilacak.
- `menu`: Uçak menüsünü temsil eden bir nesne.
- `luggageAllowance`: Bagaj hakkını temsil eden bir ondalık sayı. Double kullanilacak
- `extraLuggageFeePerKilo`: Ekstra bagaj için her kilo başına ek ücreti temsil eden bir ondalık sayı. Double kullanilacak

Metotlar:
- `Airplane(flightNumber: String, destination: String, price: double, isBusinessClass: boolean)`: Airplane sınıfının kurucu metodu.
- `Getter-setter kullanilacak`
- 
### AirplaneService
- `bookSeat(row: int, column: int, isBusinessClass: boolean): boolean`: Belirli bir koltuğu rezerve etmeyi deneyen bir metot.
- `displayMenu(): void`: Uçak menüsünü görüntüleyen metot.
- `calculatePrice(age: int, luggageWeight: double): double`: Bilet fiyatını hesaplayan metot.
- `getAvailableSeatsCount(): int`: Boş koltuk sayısını döndüren metot.
- `calculateLuggageFee(luggageWeight: double): double`: Ekstra bagaj ücretini hesaplayan metot.
- `getTotalPrice(age: int, luggageWeight: double): double`: Toplam bilet fiyatını hesaplayan metot.

### Seat (Koltuk)
Metotlar:
- `seatNumber`: Koltuk numarasını temsil eden bir dize.
- `isOccupied`: Koltuğun dolu olup olmadığını belirten bir boolean.
- `passengerName`: Koltukta oturan yolcunun adını temsil eden bir dize.
- `age`: Yolcunun yaşı.

Metotlar:
- `Seat(seatNumber: String)`: Seat sınıfının kurucu metodu.

### SeatService
Metotlar:
- `occupySeat(passengerName: String, age: int): boolean`: Koltuğu rezerve eden metot.
- `isOccupied(): boolean`: Koltuğun dolu olup olmadığını kontrol eden metot.

### Menu (Menü)

- `businessMenuItems`: Business Class menü öğelerini temsil eden bir liste (ArrayList).
- `economyMenuItems`: Ekonomi Class menü öğelerini temsil eden bir liste (ArrayList).

Metotlar:
- `displayMenu(): void`: Menüyü görüntülemek için kullanılan metot.

### MenuItem (Menü Öğesi)

- `name`: Menü öğesinin adını temsil eden bir dize.
- `price`: Menü öğesinin fiyatını temsil eden bir ondalık sayı.

### Order (Sipariş)

- `orderNumber`: Sipariş numarasını temsil eden bir dize.
- `passengerID`: Siparişi veren yolcunun idsini temsil eden bir dize.

[//]: # (- `flightNumber`: Sipariş edilen uçağın numarasını temsil eden bir dize.)
- `isBusinessClass`: Siparişin Business Class mı yoksa Ekonomi Class mı olduğunu belirten bir boolean.
- `totalPrice`: Siparişin toplam fiyatını temsil eden bir ondalık sayı.

### OrderService

Metotlar:
- `placeOrder(passengerName: String, flightNumber: String, isBusinessClass: boolean, age: int, luggageWeight: double): Order`: Yeni bir sipariş oluşturan metot.

[//]: # (- `getTotalOrderCount&#40;&#41;: int`: Toplam sipariş sayısını döndüren metot.)
- `getTotalRevenue(): double`: Toplam geliri döndüren metot.

[//]: # (- `getAverageOrderPrice&#40;&#41;: double`: Ortalama sipariş fiyatını döndüren metot.)
