insert into bestellung values (1, 'Auto');
insert into bestellung values (2, 'Speilsachen');
insert into bestellung values (3, 'Essen');

insert into order_item values (1, 'Audi', 1);
insert into order_item values (2, 'Volvo', 1);
insert into order_item values (3, 'Pasta', 3);
insert into order_item values (4, 'Monopoly', 2);

insert into product values (10, 'iPAD');
insert into product values (11, 'MacBook');
insert into product values (12, 'iPhonXR');

insert into store values (10, 'Mediamarkt');
insert into store values (11, 'Digitec');

insert into store_product values (10, 11);
insert into store_product values (11, 11);
insert into store_product values (11, 12);

insert into shipping_address values (100, 'Zürich');
insert into shipping_address values (101, 'Basel');
insert into customer values (100, 'Marzoll', 100);
insert into customer values (101, 'Ayer', 101);