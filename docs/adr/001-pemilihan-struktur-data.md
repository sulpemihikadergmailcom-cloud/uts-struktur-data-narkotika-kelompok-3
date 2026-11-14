
# ADR 001 - Pemilihan Struktur Data

## Status
Diterima

## Konteks
Aplikasi pengolahan data putusan narkotika membutuhkan
struktur data untuk menyimpan dan mengelola kumpulan
data putusan pengadilan.

Jumlah data yang digunakan dalam proyek ini adalah
50 data putusan.

## Keputusan
Kelompok memilih menggunakan Dynamic Array sebagai
struktur data utama dan Custom Stack sebagai
struktur data pendukung.

Dynamic Array dibuat secara manual menggunakan
array Object[] tanpa menggunakan ArrayList.

Custom Stack dibuat secara manual menggunakan
array Object[] dengan prinsip LIFO
(Last In, First Out).

## Alasan Pemilihan

### Dynamic Array
- Dapat menyimpan data secara berurutan.
- Kapasitas dapat bertambah secara dinamis.
- Mendukung operasi tambah, ambil, ubah, dan hapus.
- Dapat digunakan untuk proses pencarian dan pengurutan.

### Custom Stack
- Mendukung penyimpanan riwayat aktivitas.
- Menggunakan prinsip LIFO.
- Operasi push dan pop dapat dilakukan secara efisien.

## Konsekuensi
- Dynamic Array perlu mengatur kapasitas ketika penuh.
- Penghapusan elemen memerlukan pergeseran data.
- Custom Stack perlu menangani kondisi kosong.
- Implementasi manual membutuhkan pengujian tersendiri.

## Kompleksitas

| Operasi | Kompleksitas |
|---|---|
| Dynamic Array add (amortized) | O(1) |
| Dynamic Array get | O(1) |
| Dynamic Array remove | O(n) |
| Linear Search | O(n) |
| Binary Search | O(log n) |
| Insertion Sort | O(n^2) |
| Merge Sort | O(n log n) |
| Stack push (amortized) | O(1) |
| Stack pop | O(1) |
| Stack peek | O(1) |

## Pengujian
Pengujian dilakukan menggunakan JUnit 5
untuk memeriksa operasi Dynamic Array,
Custom Stack, pencarian, dan pengurutan.
