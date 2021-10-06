-- phpMyAdmin SQL Dump
-- version 3.2.0.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Oct 06, 2021 at 05:47 AM
-- Server version: 5.1.36
-- PHP Version: 5.3.0

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `airticket`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`username`, `password`) VALUES
('admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `flight`
--

CREATE TABLE IF NOT EXISTS `flight` (
  `company` varchar(100) NOT NULL,
  `from` varchar(100) NOT NULL,
  `to` varchar(100) NOT NULL,
  `date` text NOT NULL,
  `seats` text NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `flight`
--

INSERT INTO `flight` (`company`, `from`, `to`, `date`, `seats`) VALUES
('airindia', 'tvm', 'dubai', '03-04-2021  3:30 PM', '100'),
('Air Arabia', 'Trivandrum', 'Saudi Arabya', '26-04-2021 10:00 AM', '120');

-- --------------------------------------------------------

--
-- Table structure for table `ticketbooking`
--

CREATE TABLE IF NOT EXISTS `ticketbooking` (
  `company` varchar(100) NOT NULL,
  `uname` varchar(100) NOT NULL,
  `dob` text NOT NULL,
  `passportno` text NOT NULL,
  `phno` varchar(100) NOT NULL,
  `address` varchar(100) NOT NULL,
  `from` varchar(300) NOT NULL,
  `to` varchar(100) NOT NULL,
  `datetime` text NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ticketbooking`
--

INSERT INTO `ticketbooking` (`company`, `uname`, `dob`, `passportno`, `phno`, `address`, `from`, `to`, `datetime`) VALUES
('airindia', 'zainu', '01-11-2000', '123456789pom', '3225258585', 'kowdiar', 'tvm', 'dubai', '04-11-2021'),
('Air Arabya', 'Aainu', '01-10-2000', '1234567890455', '1234567890', 'Trivandrum', 'Tvm', 'Saudi', '26-04-2021');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `name` varchar(100) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `phone` varchar(100) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`name`, `username`, `password`, `email`, `phone`) VALUES
('zainu', 'zainu', '123zainu', 'zainu@gmail.com', '1234567890');
