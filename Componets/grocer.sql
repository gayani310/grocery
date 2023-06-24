-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.5.0-m2-community - MySQL Community Server (GPL)
-- Server OS:                    Win64
-- HeidiSQL Version:             12.0.0.6468
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for grocery
CREATE DATABASE IF NOT EXISTS `grocery` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `grocery`;

-- Dumping structure for table grocery.brand
CREATE TABLE IF NOT EXISTS `brand` (
  `brand_id` varchar(20) NOT NULL,
  `brand_name` varchar(50) NOT NULL,
  `brand_category` varchar(45) NOT NULL,
  `brand_description` varchar(100) NOT NULL,
  `brand_status` tinyint(1) NOT NULL,
  PRIMARY KEY (`brand_id`),
  KEY `FK_CATEGORY1` (`brand_category`),
  CONSTRAINT `FK_CAT` FOREIGN KEY (`brand_category`) REFERENCES `category` (`cat_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table grocery.brand: ~15 rows (approximately)
INSERT INTO `brand` (`brand_id`, `brand_name`, `brand_category`, `brand_description`, `brand_status`) VALUES
	('B1', 'Manchee', 'CAT1', 'Biscuit', 1),
	('B10', 'Wasana Bakers', 'CAT2', 'Baker 1', 1),
	('B11', 'SunLight', 'CAT10', 'All Cleaning', 1),
	('B12', 'Koswatta', 'CAT6', 'No', 1),
	('B13', 'Edhirisinghe', 'CAT10', 'Ekle', 1),
	('B14', 'Fanta', 'CAT1', 'Beverages', 1),
	('B15', 'Elephant House', 'CAT1', 'Celon', 1),
	('B2', 'Kothmale', 'CAT2', 'No', 1),
	('B3', 'Maliban', 'CAT2', 'no', 1),
	('B4', ' HIghland', 'CAT1', 'No', 1),
	('B5', 'Sri Lanka', 'CAT2', 'No', 1),
	('B6', 'Anchor', 'CAT4', 'No', 1),
	('B7', 'Atlas', 'CAT9', 'Special', 1),
	('B8', 'Richard', 'CAT9', 'No', 1),
	('B9', 'Cologuard', 'CAT1', 'No', 1);

-- Dumping structure for table grocery.category
CREATE TABLE IF NOT EXISTS `category` (
  `cat_id` varchar(25) NOT NULL,
  `cat_name` varchar(100) NOT NULL,
  `cat_description` varchar(255) NOT NULL,
  `cat_status` tinyint(4) NOT NULL,
  PRIMARY KEY (`cat_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table grocery.category: ~12 rows (approximately)
INSERT INTO `category` (`cat_id`, `cat_name`, `cat_description`, `cat_status`) VALUES
	('CAT1', 'Beverages', 'Drinks', 1),
	('CAT10', 'Cleaning', 'Soap, Toothbrush', 0),
	('CAT11', 'Washing', 'Soap , Toothbrush', 1),
	('CAT12', 'Other', 'All Other', 1),
	('CAT2', 'food', 'new foods', 1),
	('CAT3', 'Bakery', 'All ', 1),
	('CAT4', 'Dairy', 'Milk, Cheese, Butter, Churd', 1),
	('CAT5', 'Detergents', 'All type', 1),
	('CAT6', 'Snacks', 'Nuts, Tipitip', 1),
	('CAT7', 'Health and Beauty', 'Creams, Powder', 1),
	('CAT8', 'Households', 'Brushes', 1),
	('CAT9', 'Stationary', 'Books, Pensils', 1);

-- Dumping structure for table grocery.customer
CREATE TABLE IF NOT EXISTS `customer` (
  `cus_id` varchar(50) NOT NULL DEFAULT '',
  `cus_name` varchar(100) NOT NULL,
  `cus_type` varchar(45) NOT NULL,
  `cus_contact` varchar(45) NOT NULL,
  `cus_address` varchar(255) NOT NULL,
  `employee` varchar(25) NOT NULL DEFAULT '',
  `cus_status` tinyint(1) NOT NULL,
  PRIMARY KEY (`cus_id`),
  KEY `FK_EMPID` (`employee`),
  CONSTRAINT `FK_EMPID` FOREIGN KEY (`employee`) REFERENCES `employee` (`emp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table grocery.customer: ~2 rows (approximately)
INSERT INTO `customer` (`cus_id`, `cus_name`, `cus_type`, `cus_contact`, `cus_address`, `employee`, `cus_status`) VALUES
	('CUS1', 'Daily customer', 'Cash Customer', '07523659', 'Colombo', 'EMP1', 1),
	('CUS2', 'Daily customer', 'Card Customer', '077528659', 'Ja-ela', 'EMP2', 1);

-- Dumping structure for table grocery.employee
CREATE TABLE IF NOT EXISTS `employee` (
  `emp_id` varchar(25) NOT NULL,
  `emp_name` varchar(60) NOT NULL,
  `user_type` varchar(45) NOT NULL,
  `emp_username` varchar(45) NOT NULL,
  `emp_contctno` varchar(45) NOT NULL,
  `emp_password` varchar(255) NOT NULL,
  `emp_address` varchar(255) NOT NULL,
  `emp_status` tinyint(1) NOT NULL,
  PRIMARY KEY (`emp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table grocery.employee: ~6 rows (approximately)
INSERT INTO `employee` (`emp_id`, `emp_name`, `user_type`, `emp_username`, `emp_contctno`, `emp_password`, `emp_address`, `emp_status`) VALUES
	('EMP1', 'gayani vitrhnagamge admin', 'Admin', 'gayani', '0768971215', '202cb962ac59075b964b07152d234b70', 'sri lanka', 0),
	('EMP2', 'achintha isuru', 'User', 'achi', '0718272801', '250cf8b51c773f3f8dc8b4be867a9a02', 'sri lanka', 1),
	('EMP3', 'Nawodya Melani', 'User', 'Melani', '0715269584', '68053af2923e00204c3ca7c6a3150cf7', 'Nittabuwa', 1),
	('EMP4', 'Nawodya Melani', 'Admin', 'Melani', '071526985', '68053af2923e00204c3ca7c6a3150cf7', 'Mirigama', 0),
	('EMP5', '', 'Admin', '', '', 'd41d8cd98f00b204e9800998ecf8427e', '', 0),
	('EMP6', 'Lakshi Visharada', 'User', 'Lakshi', '0711944609', 'dec46145e2c5fa1e6a9edf0820566796', 'Kandy', 1);

-- Dumping structure for table grocery.grn
CREATE TABLE IF NOT EXISTS `grn` (
  `id_defualt` int(11) NOT NULL AUTO_INCREMENT,
  `grn_id` varchar(50) NOT NULL,
  `supplier_id` varchar(45) NOT NULL,
  `item_id` int(11) NOT NULL DEFAULT '0',
  `item_name` varchar(50) NOT NULL,
  `cat_id` varchar(25) NOT NULL,
  `brand_id` varchar(20) NOT NULL,
  `qty` int(11) NOT NULL,
  `manufactured_date` date NOT NULL,
  `epd` date NOT NULL,
  `cost_price` int(11) NOT NULL,
  `selling_price` double NOT NULL,
  `total` double NOT NULL,
  `enterdatetime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `emp_id` varchar(45) NOT NULL,
  `status` tinyint(1) NOT NULL,
  PRIMARY KEY (`id_defualt`) USING BTREE,
  KEY `FK_SUPPLIERID` (`supplier_id`),
  KEY `FK_ITEMID` (`item_id`),
  KEY `FK_CATEGORY` (`cat_id`),
  KEY `FK_BRAND` (`brand_id`),
  KEY `FK_EMPLOYEE` (`emp_id`),
  CONSTRAINT `FK_BRAND` FOREIGN KEY (`brand_id`) REFERENCES `brand` (`brand_id`),
  CONSTRAINT `FK_CATEGORY` FOREIGN KEY (`cat_id`) REFERENCES `category` (`cat_id`),
  CONSTRAINT `FK_EMPLOYEE` FOREIGN KEY (`emp_id`) REFERENCES `employee` (`emp_id`),
  CONSTRAINT `FK_ITEMID` FOREIGN KEY (`item_id`) REFERENCES `item` (`item_id`),
  CONSTRAINT `FK_SUPPLIERID` FOREIGN KEY (`supplier_id`) REFERENCES `supplier` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- Dumping data for table grocery.grn: ~4 rows (approximately)
INSERT INTO `grn` (`id_defualt`, `grn_id`, `supplier_id`, `item_id`, `item_name`, `cat_id`, `brand_id`, `qty`, `manufactured_date`, `epd`, `cost_price`, `selling_price`, `total`, `enterdatetime`, `emp_id`, `status`) VALUES
	(1, 'Grn1', 'SUP1', 3, 'milk', 'CAT1', 'B1', 5, '2022-08-02', '2024-08-15', 30, 50, 1500, '2022-08-17 06:54:34', 'EMP1', 0),
	(2, 'Grn2', 'SUP1', 3, 'milk', 'CAT1', 'B1', 5, '2022-08-02', '2024-08-15', 40, 60, 2400, '2022-08-17 07:14:21', 'EMP1', 0),
	(3, 'Grn3', 'SUP1', 4, 'Toothpaste', 'CAT1', 'B1', 5, '2022-08-10', '2025-08-12', 50, 80, 4000, '2022-08-17 07:14:21', 'EMP1', 0),
	(4, 'Grn4', 'SUP1', 25, 'Ekel', 'CAT8', 'B13', 5, '2022-08-03', '2024-08-09', 100, 150, 15000, '2022-08-17 07:24:33', 'EMP1', 0);

-- Dumping structure for table grocery.invoice
CREATE TABLE IF NOT EXISTS `invoice` (
  `invoice_id` varchar(45) NOT NULL,
  `cus_id` varchar(50) NOT NULL,
  `cus_type` varchar(50) NOT NULL,
  `currentdate` datetime NOT NULL,
  `subtotal2` double NOT NULL,
  `discount` double NOT NULL,
  `nettotal` double NOT NULL,
  `payment` double NOT NULL,
  `balance` double NOT NULL,
  `emp_id` varchar(45) NOT NULL,
  PRIMARY KEY (`invoice_id`),
  KEY `FK_CUSTOMID` (`cus_id`),
  KEY `FK_EMPLOYEEID` (`emp_id`),
  CONSTRAINT `FK_CUSTOMID` FOREIGN KEY (`cus_id`) REFERENCES `customer` (`cus_id`),
  CONSTRAINT `FK_EMPLOYEEID` FOREIGN KEY (`emp_id`) REFERENCES `employee` (`emp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table grocery.invoice: ~4 rows (approximately)
INSERT INTO `invoice` (`invoice_id`, `cus_id`, `cus_type`, `currentdate`, `subtotal2`, `discount`, `nettotal`, `payment`, `balance`, `emp_id`) VALUES
	('INVOICE1', 'CUS1', 'Cash Customer', '2022-07-30 15:22:18', 950, 5, 902.5, 1000, 97.5, 'EMP1'),
	('INVOICE2', 'CUS1', 'Cash Customer', '2022-07-30 15:26:57', 380, 5, 361, 500, 139, 'EMP1'),
	('INVOICE3', 'Cus2', 'Card Customer', '2022-07-30 17:57:39', 640, 20, 512, 600, 88, 'EMP1'),
	('INVOICE4', 'CUS1', 'Cash Customer', '2022-07-30 18:10:21', 410, 5, 389.5, 400, 10.5, 'EMP1');

-- Dumping structure for table grocery.invoice_item
CREATE TABLE IF NOT EXISTS `invoice_item` (
  `invoive_itemid` int(11) NOT NULL AUTO_INCREMENT,
  `invoice_id` varchar(45) NOT NULL,
  `product_id` int(11) NOT NULL,
  `item_name` varchar(100) NOT NULL,
  `unit_price` double NOT NULL,
  `qty` int(11) NOT NULL,
  `item_total` double NOT NULL,
  PRIMARY KEY (`invoive_itemid`),
  KEY `FK_INVOICEID` (`invoice_id`),
  CONSTRAINT `FK_INVOICEID` FOREIGN KEY (`invoice_id`) REFERENCES `invoice` (`invoice_id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=latin1;

-- Dumping data for table grocery.invoice_item: ~3 rows (approximately)
INSERT INTO `invoice_item` (`invoive_itemid`, `invoice_id`, `product_id`, `item_name`, `unit_price`, `qty`, `item_total`) VALUES
	(24, 'INVOICE4', 20, 'Komarika', 80, 2, 160),
	(25, 'INVOICE4', 25, 'Ekel', 100, 1, 100),
	(26, 'INVOICE4', 14, 'Jumbo Nuts', 50, 3, 150);

-- Dumping structure for table grocery.item
CREATE TABLE IF NOT EXISTS `item` (
  `item_id` int(11) NOT NULL AUTO_INCREMENT,
  `item_barcode` mediumtext NOT NULL,
  `pro_id` int(11) NOT NULL,
  `item_name` varchar(45) NOT NULL,
  `item_category` varchar(45) NOT NULL,
  `item_brand` varchar(45) NOT NULL,
  `item_unit` varchar(45) NOT NULL,
  `item_description` varchar(255) NOT NULL,
  `item_sup` varchar(45) NOT NULL,
  `item_currentdate` datetime NOT NULL,
  `emp_id` varchar(20) NOT NULL,
  `item_status` tinyint(1) NOT NULL,
  PRIMARY KEY (`item_id`),
  KEY `FK_EMPLOYEE` (`emp_id`),
  KEY `FK_CATEGORY` (`item_category`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=latin1;

-- Dumping data for table grocery.item: ~34 rows (approximately)
INSERT INTO `item` (`item_id`, `item_barcode`, `pro_id`, `item_name`, `item_category`, `item_brand`, `item_unit`, `item_description`, `item_sup`, `item_currentdate`, `emp_id`, `item_status`) VALUES
	(1, '1236548', 1, 'Coconut sri lanka', 'CAT2', 'B1', 'Kg', 'new product', 'SUP1', '2022-07-01 22:07:40', 'null', 0),
	(2, '123', 2, 'Soap', 'CAT11', 'B11', 'Pcs', 'New', 'SUP1', '2022-07-02 00:12:12', 'EMP1', 1),
	(3, '1236', 3, 'milk', 'CAT1', 'B1', 'Kg', 'new', 'SUP1', '2022-07-02 00:21:35', 'null', 1),
	(4, '45698', 4, 'Toothpaste', 'CAT1', 'B1', 'Kg', 'new', 'SUP1', '2022-07-02 00:22:28', 'null', 1),
	(5, '123698', 5, 'yoghurt', 'CAT1', 'B1', 'Kg', 'new', 'SUP1', '2022-07-02 00:24:42', 'null', 1),
	(6, '12345', 6, 'Books', 'CAT1', 'B1', 'Kg', 'No', 'SUP1', '2022-07-05 00:46:57', 'EMP1', 1),
	(7, '112465', 7, 'Fish Bun', 'CAT3', 'B10', 'Pcs', 'No', 'SUP6', '2022-07-30 12:39:34', 'EMP1', 0),
	(8, '124578', 7, 'Egg Bun', 'CAT3', 'B10', 'Pcs', 'No', 'SUP6', '2022-07-30 12:39:34', 'EMP1', 0),
	(9, '78566', 9, 'Small Bun', 'CAT3', 'B10', 'Pcs', 'New', 'SUP1', '2022-07-30 12:45:56', 'EMP1', 1),
	(10, '145789', 10, 'Cheese', 'CAT4', 'B2', 'Pcs', 'No', 'SUP1', '2022-07-30 12:56:38', 'EMP1', 0),
	(11, '775896', 11, 'Butter', 'CAT1', 'B1', 'Pcs', 'No', 'SUP1', '2022-07-30 12:56:38', 'EMP1', 1),
	(12, '12546', 12, 'Washing powder', 'CAT5', 'B11', 'Packets', 'New', 'SUP1', '2022-07-30 13:15:14', 'EMP1', 1),
	(13, '78699', 13, 'Shampoo', 'CAT5', 'B11', 'Pcs', 'New', 'SUP1', '2022-07-30 13:16:54', 'EMP1', 1),
	(14, '124578', 14, 'Jumbo Nuts', 'CAT6', 'B12', 'Packets', 'New', 'SUP1', '2022-07-30 13:16:54', 'EMP1', 1),
	(15, '124575', 15, 'Tipitip', 'CAT6', 'B12', 'Packets', 'No', 'SUP5', '2022-07-30 13:16:54', 'EMP1', 1),
	(16, '145879', 16, 'Photato Chips', 'CAT6', 'B12', 'Packets', 'No', 'SUP7', '2022-07-30 13:16:54', 'EMP1', 1),
	(17, '1247836', 17, 'Party Mix', 'CAT6', 'B12', 'Packets', 'New', 'SUP7', '2022-07-30 13:16:54', 'EMP1', 1),
	(18, '147853', 18, 'Cheese Snacks', 'CAT6', 'B12', 'Packets', 'New', 'SUP7', '2022-07-30 13:16:54', 'EMP1', 1),
	(19, '78593', 19, 'Panadol', 'CAT7', 'B13', 'Packets', 'New', 'SUP4', '2022-07-30 13:16:54', 'EMP1', 1),
	(20, '77854', 20, 'Komarika', 'CAT7', 'B13', 'Packets', 'New', 'SUP4', '2022-07-30 13:16:54', 'EMP1', 1),
	(21, '14587', 21, 'Pears Soap', 'CAT7', 'B13', 'Pcs', 'New', 'SUP4', '2022-07-30 13:16:54', 'EMP1', 1),
	(22, '45852', 22, 'Sandun', 'CAT7', 'B13', 'Pcs', 'New', 'SUP4', '2022-07-30 13:16:54', 'EMP1', 1),
	(23, '75896', 23, 'Siddalepa', 'CAT7', 'B13', 'Pcs', 'New', 'SUP4', '2022-07-30 13:16:54', 'EMP1', 1),
	(24, '7859', 24, 'Broom', 'CAT8', 'B13', 'Pcs', 'New', 'SUP4', '2022-07-30 13:16:54', 'EMP1', 1),
	(25, '78965', 25, 'Ekel', 'CAT8', 'B13', 'Pcs', 'New', 'SUP4', '2022-07-30 13:16:54', 'EMP1', 1),
	(26, '13695', 26, 'CR Book', 'CAT9', 'B7', 'Pcs', 'No', 'SUP1', '2022-07-30 13:16:54', 'EMP1', 1),
	(27, '2589', 27, 'Drawing Books', 'CAT9', 'B7', 'Pcs', 'New', 'SUP1', '2022-07-30 13:16:54', 'EMP1', 1),
	(28, '1256', 28, 'Soap', 'CAT1', 'B1', 'Kg', 'New', 'SUP1', '2022-07-30 14:33:21', 'EMP1', 0),
	(30, '4758', 30, 'Erasers', 'CAT9', 'B7', 'Pcs', 'No', 'SUP1', '2022-07-30 21:12:47', 'EMP1', 1),
	(31, '12548', 30, 'Mozaralla Cheese', 'CAT4', 'B1', 'Packets', 'New', 'SUP1', '2022-07-30 21:24:21', 'EMP1', 1),
	(32, '12458', 31, 'Cream Bun', 'CAT3', 'B10', 'Pcs', 'New', 'SUP1', '2022-07-30 21:46:39', 'EMP1', 1),
	(33, '12458', 32, 'Veggie Bun', 'CAT3', 'B10', 'Pcs', 'No', 'SUP1', '2022-07-30 22:59:09', 'EMP1', 1),
	(34, '121365', 33, 'Veggie Bun', 'CAT3', 'B10', 'Pcs', 'No', 'SUP1', '2022-08-06 12:58:15', 'EMP1', 1),
	(35, '12365', 34, 'Fish Bunn', 'CAT3', 'B10', 'Pcs', 'No', 'SUP1', '2022-08-06 12:59:55', 'EMP1', 1);

-- Dumping structure for table grocery.supplier
CREATE TABLE IF NOT EXISTS `supplier` (
  `id` varchar(45) NOT NULL,
  `name` varchar(255) NOT NULL,
  `contact_no` int(11) NOT NULL,
  `address` varchar(300) NOT NULL,
  `status` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table grocery.supplier: ~7 rows (approximately)
INSERT INTO `supplier` (`id`, `name`, `contact_no`, `address`, `status`) VALUES
	('SUP1', 'P.Perera and son', 71526895, 'Ja Ela sroi lanka', 1),
	('SUP2', 'nimal siripala', 74587985, 'new suppler', 0),
	('SUP3', 'N.Wasana', 113562985, 'Mirigama', 0),
	('SUP4', 'K.Karunarathne', 775896425, 'Kandy', 1),
	('SUP5', 'Anuththara Wicrama', 756892356, 'Ragama', 1),
	('SUP6', 'Shan Weerasuriya', 114587965, 'Weyangoda', 1),
	('SUP7', 'Sunanda Suppliers', 114785698, 'Colombo', 1);

-- Dumping structure for table grocery.user_type
CREATE TABLE IF NOT EXISTS `user_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `u_type` varchar(45) NOT NULL,
  `description` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- Dumping data for table grocery.user_type: ~2 rows (approximately)
INSERT INTO `user_type` (`id`, `u_type`, `description`) VALUES
	(1, 'Admin', 'admin'),
	(2, 'User', 'user');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
