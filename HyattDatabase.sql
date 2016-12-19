-- phpMyAdmin SQL Dump
-- version 4.5.2
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Dec 13, 2016 at 12:29 AM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 5.5.37

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `Hyatt`
--

-- --------------------------------------------------------

--
-- Table structure for table `Chi_Centric`
--

CREATE TABLE `Chi_Centric` (
  `Room_Type` varchar(20) NOT NULL,
  `Room_Number` int(11) NOT NULL,
  `Price` double NOT NULL,
  `Status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Chi_Centric`
--

INSERT INTO `Chi_Centric` (`Room_Type`, `Room_Number`, `Price`, `Status`) VALUES
('Single', 1, 168, 'Available'),
('Double', 2, 204, 'Available'),
('Double', 3, 193, 'Available'),
('Single', 4, 185, 'Available'),
('Single', 5, 179, 'Available');

-- --------------------------------------------------------

--
-- Table structure for table `Chi_Place`
--

CREATE TABLE `Chi_Place` (
  `Room_Type` varchar(20) NOT NULL,
  `Room_Number` int(11) NOT NULL,
  `Price` double NOT NULL,
  `Status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Chi_Place`
--

INSERT INTO `Chi_Place` (`Room_Type`, `Room_Number`, `Price`, `Status`) VALUES
('Double', 1, 216, 'Available'),
('Double', 2, 210, 'Available'),
('Single', 3, 198, 'Available'),
('Double', 4, 203, 'Available'),
('Single', 5, 208, 'Available');

-- --------------------------------------------------------

--
-- Table structure for table `Chi_Regency`
--

CREATE TABLE `Chi_Regency` (
  `Room_Type` varchar(20) NOT NULL,
  `Room_Number` int(11) NOT NULL,
  `Price` double NOT NULL,
  `Status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Chi_Regency`
--

INSERT INTO `Chi_Regency` (`Room_Type`, `Room_Number`, `Price`, `Status`) VALUES
('Single', 1, 278, 'Available'),
('Single', 2, 293, 'Available'),
('Double', 3, 307, 'Available'),
('Single', 4, 265, 'Available'),
('Double', 5, 277, 'Available');

-- --------------------------------------------------------

--
-- Table structure for table `DA_House`
--

CREATE TABLE `DA_House` (
  `Room_Type` varchar(20) NOT NULL,
  `Room_Number` int(11) NOT NULL,
  `Price` double NOT NULL,
  `Status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `DA_House`
--

INSERT INTO `DA_House` (`Room_Type`, `Room_Number`, `Price`, `Status`) VALUES
('Single', 1, 162, 'Available'),
('Single', 2, 173, 'Available'),
('Double', 3, 187, 'Available'),
('Double', 4, 181, 'Available'),
('Double', 5, 194, 'Available');

-- --------------------------------------------------------

--
-- Table structure for table `DA_Place`
--

CREATE TABLE `DA_Place` (
  `Room_Type` varchar(20) NOT NULL,
  `Room_Number` int(11) NOT NULL,
  `Price` double NOT NULL,
  `Status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `DA_Place`
--

INSERT INTO `DA_Place` (`Room_Type`, `Room_Number`, `Price`, `Status`) VALUES
('Single', 1, 121, 'Available'),
('Single', 2, 137, 'Available'),
('Single', 3, 132, 'Available'),
('Single', 4, 119, 'Available'),
('Single', 5, 128, 'Available');

-- --------------------------------------------------------

--
-- Table structure for table `Hyatt_CHI`
--

CREATE TABLE `Hyatt_CHI` (
  `Name` varchar(20) NOT NULL,
  `Area` varchar(20) NOT NULL,
  `Price` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Hyatt_CHI`
--

INSERT INTO `Hyatt_CHI` (`Name`, `Area`, `Price`) VALUES
('Hyatt Centric', 'Loop', 190),
('Hyatt Regency', 'Magnificent Mile', 270),
('Hyatt Place', 'River North', 220);

-- --------------------------------------------------------

--
-- Table structure for table `Hyatt_DA`
--

CREATE TABLE `Hyatt_DA` (
  `Name` varchar(20) NOT NULL,
  `Area` varchar(20) NOT NULL,
  `Price` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Hyatt_DA`
--

INSERT INTO `Hyatt_DA` (`Name`, `Area`, `Price`) VALUES
('Hyatt Place', 'Park Central', 130),
('Hyatt House ', 'Uptown', 180);

-- --------------------------------------------------------

--
-- Table structure for table `Hyatt_LA`
--

CREATE TABLE `Hyatt_LA` (
  `Name` varchar(20) NOT NULL,
  `Area` varchar(20) NOT NULL,
  `Price` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Hyatt_LA`
--

INSERT INTO `Hyatt_LA` (`Name`, `Area`, `Price`) VALUES
('Hyatt Place', 'Segundo', 210),
('Hyatt Regency', 'Long Beach', 190);

-- --------------------------------------------------------

--
-- Table structure for table `Hyatt_MIA`
--

CREATE TABLE `Hyatt_MIA` (
  `Name` varchar(20) NOT NULL,
  `Area` varchar(20) NOT NULL,
  `Price` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Hyatt_MIA`
--

INSERT INTO `Hyatt_MIA` (`Name`, `Area`, `Price`) VALUES
('Hyatt Centric', 'South Beach', 330),
('Hyatt House', 'Coral Gables', 290);

-- --------------------------------------------------------

--
-- Table structure for table `Hyatt_NYC`
--

CREATE TABLE `Hyatt_NYC` (
  `Name` varchar(20) NOT NULL,
  `Area` varchar(20) NOT NULL,
  `Price` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Hyatt_NYC`
--

INSERT INTO `Hyatt_NYC` (`Name`, `Area`, `Price`) VALUES
('Park Hyatt', 'NYC', 1200),
('Hyatt Place', 'Midtown', 225);

-- --------------------------------------------------------

--
-- Table structure for table `LA_Place`
--

CREATE TABLE `LA_Place` (
  `Room_Type` varchar(20) NOT NULL,
  `Room_Number` int(11) NOT NULL,
  `Price` double NOT NULL,
  `Status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `LA_Place`
--

INSERT INTO `LA_Place` (`Room_Type`, `Room_Number`, `Price`, `Status`) VALUES
('Double', 1, 236, 'Available'),
('Double', 2, 218, 'Available'),
('Single', 3, 217, 'Available'),
('Single', 4, 221, 'Available'),
('Single', 5, 207, 'Available ');

-- --------------------------------------------------------

--
-- Table structure for table `LA_Regency`
--

CREATE TABLE `LA_Regency` (
  `Room_Type` varchar(20) NOT NULL,
  `Room_Number` int(11) NOT NULL,
  `Price` double NOT NULL,
  `Status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `LA_Regency`
--

INSERT INTO `LA_Regency` (`Room_Type`, `Room_Number`, `Price`, `Status`) VALUES
('Single', 1, 201, 'Available'),
('Single', 2, 183, 'Available'),
('Double', 3, 196, 'Available'),
('Single', 4, 191, 'Available'),
('Double', 5, 208, 'Available');

-- --------------------------------------------------------

--
-- Table structure for table `Location`
--

CREATE TABLE `Location` (
  `City` varchar(30) NOT NULL,
  `State` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Location`
--

INSERT INTO `Location` (`City`, `State`) VALUES
('Chicago', 'Illinois'),
('Los Angelos', 'California'),
('New York City', 'New York'),
('Miami', 'Florida'),
('Dallas', 'Texas'),
('Chicago', 'Illinois'),
('Los Angelos', 'California'),
('New York City', 'New York'),
('Miami', 'Florida'),
('Dallas', 'Texas');

-- --------------------------------------------------------

--
-- Table structure for table `MIA_Centric`
--

CREATE TABLE `MIA_Centric` (
  `Room_Type` varchar(20) NOT NULL,
  `Room_Number` int(11) NOT NULL,
  `Price` double NOT NULL,
  `Status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `MIA_Centric`
--

INSERT INTO `MIA_Centric` (`Room_Type`, `Room_Number`, `Price`, `Status`) VALUES
('Double', 1, 362, 'Available'),
('Single', 2, 329, 'Available'),
('Double', 3, 352, 'Available'),
('Double', 4, 346, 'Available'),
('Single', 5, 335, 'Available');

-- --------------------------------------------------------

--
-- Table structure for table `MIA_House`
--

CREATE TABLE `MIA_House` (
  `Room_Type` varchar(20) NOT NULL,
  `Room_Number` int(11) NOT NULL,
  `Price` double NOT NULL,
  `Status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `MIA_House`
--

INSERT INTO `MIA_House` (`Room_Type`, `Room_Number`, `Price`, `Status`) VALUES
('Single', 1, 273, 'Available'),
('Single', 2, 297, 'Available'),
('Double', 3, 303, 'Available'),
('Double', 4, 298, 'Available'),
('Double', 5, 316, 'Available');

-- --------------------------------------------------------

--
-- Table structure for table `NYC_Park`
--

CREATE TABLE `NYC_Park` (
  `Room_Type` varchar(20) NOT NULL,
  `Room_Number` int(11) NOT NULL,
  `Price` double NOT NULL,
  `Status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `NYC_Park`
--

INSERT INTO `NYC_Park` (`Room_Type`, `Room_Number`, `Price`, `Status`) VALUES
('Double', 1, 1535, 'Available'),
('Single', 2, 1282, 'Available'),
('Single', 3, 1339, 'Available'),
('Double', 4, 1425, 'Available'),
('Single', 5, 1347, 'Available');

-- --------------------------------------------------------

--
-- Table structure for table `NYC_Place`
--

CREATE TABLE `NYC_Place` (
  `Room_Type` varchar(20) NOT NULL,
  `Room_Number` int(11) NOT NULL,
  `Price` double NOT NULL,
  `Status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `NYC_Place`
--

INSERT INTO `NYC_Place` (`Room_Type`, `Room_Number`, `Price`, `Status`) VALUES
('Single', 1, 218, 'Available'),
('Single', 2, 229, 'Available'),
('Double', 3, 244, 'Available'),
('Double', 4, 232, 'Available'),
('Single', 5, 227, 'Available');

-- --------------------------------------------------------

--
-- Table structure for table `Reservations`
--

CREATE TABLE `Reservations` (
  `Name` varchar(40) NOT NULL,
  `Check_In` date NOT NULL,
  `Check_Out` date NOT NULL,
  `City` varchar(40) NOT NULL,
  `Hotel` varchar(20) NOT NULL,
  `Room_Type` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Reservations`
--

INSERT INTO `Reservations` (`Name`, `Check_In`, `Check_Out`, `City`, `Hotel`, `Room_Type`) VALUES
('Sojung Hwang', '2017-12-31', '2017-10-20', 'Los Angelos, California', 'Hyatt Place Segundo', 'Single');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
