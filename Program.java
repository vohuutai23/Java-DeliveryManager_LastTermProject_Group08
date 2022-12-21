package mypack;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Program {
	public static List<Store> lStore = new ArrayList<Store>();
	public static List<Electronic> lElectronic = new ArrayList<Electronic>();
	public static List<Fashion> lFashion = new ArrayList<Fashion>();
	public static List<Food> lFood = new ArrayList<Food>();
	public static List<Cosmetic> lCosmetic = new ArrayList<Cosmetic>();
	public static List<Houseware> lHouseware = new ArrayList<Houseware>();

	public static List<Order> lOrder = new ArrayList<Order>();
	public static List<OrderDetails> lOrderDetails = new ArrayList<OrderDetails>();
	public static List<WareHouseManagement> lWareHouseManagement = new ArrayList<WareHouseManagement>();
	public static List<Shipper> lShipper = new ArrayList<Shipper>();
	public static List<SortingEmployee> lSortingEmployee = new ArrayList<SortingEmployee>();
	public static List<ShippingInformationofTheOrder> lShippingInf = new ArrayList<ShippingInformationofTheOrder>();
	public static List<Receipt> lReceipt = new ArrayList<Receipt>();
	public static List<ReceiptDetails> lReceiptDetails = new ArrayList<ReceiptDetails>();
	public static List<Customer> lCustomer = new ArrayList<Customer>();

	public static void CreListStore() {
		lStore.add(new Store("ST01", "StoreA", "StoreAddressA", "91111"));
		lStore.add(new Store("ST02", "StoreB", "StoreAddressB", "91112"));
		lStore.add(new Store("ST03", "StoreC", "StoreAddressC", "91113"));
		lStore.add(new Store("ST04", "StoreD", "StoreAddressD", "91114"));
		lStore.add(new Store("ST05", "StoreE", "StoreAddressE", "91115"));
		lStore.add(new Store("ST06", "StoreF", "StoreAddressF", "91116"));
		lStore.add(new Store("ST07", "StoreG", "StoreAddressG", "91117"));
		lStore.add(new Store("ST08", "StoreH", "StoreAddressH", "91118"));
		lStore.add(new Store("ST09", "StoreI", "StoreAddressI", "91119"));
		lStore.add(new Store("ST10", "StoreK", "StoreAddressK", "91120"));
	}

	public static void CreListElectronic() {
		lElectronic.add(new Electronic(0.1, "ItemColour1", "PD04", "Electronic2", "Origin4", 4000, 1.4, "ST04"));
		lElectronic.add(new Electronic(0.2, "ItemColour2", "PD12", "Electric12", "Origin12", 12000, 2.2, "ST01"));
		lElectronic.add(new Electronic(0.3, "ItemColour3", "PD01", "Electronic1", "Origin1", 1000, 1.1, "ST01"));
		lElectronic.add(new Electronic(0.4, "ItemColour4", "PD13", "Electronic13", "Origin13", 13000, 2.3, "St04"));
	}

	public static void CreListFashion() {
		lFashion.add(new Fashion(29, "ItemFashionColor1", "PD21", "Fashion21", "Origin21", 21000, 2.2, "ST08"));
		lFashion.add(new Fashion(30, "ItemFashionColor2", "PD21", "Fashion08", "Origin08", 8000, 1.8, "ST08"));
		lFashion.add(new Fashion(31, "ItemFashionColor3", "PD21", "Fashion02", "Origin02", 2000, 1.2, "ST02"));
		lFashion.add(new Fashion(32, "ItemFashionColor4", "PD21", "Fashion10", "Origin10", 10000, 2.0, "ST10"));
	}

	public static void CreListFood() {
		lFood.add(new Food("1/1/2022", "1/1/2023", "PD98", "Food98", "Origin98", 98000, 9.8, "ST06"));
		lFood.add(new Food("2/1/2022", "2/1/2023", "PD03", "Food03", "Origin03", 3000, 0.3, "ST03"));
		lFood.add(new Food("3/1/2022", "3/1/2023", "PD99", "Food99", "Origin99", 99000, 9.9, "ST03"));
		lFood.add(new Food("4/1/2022", "4/1/2023", "PD06", "Food06", "Origin06", 6000, 0.6, "ST06"));
	}

	public static void CreListCosmetic() {
		lCosmetic.add(new Cosmetic("1/2/2022", "1/2/2023", "PD90", "Cosmetic90", "Origin90", 90000, 9.0, "ST05"));
		lCosmetic.add(new Cosmetic("2/2/2022", "2/2/2023", "PD05", "Cosmetic05", "Origin05", 5000, 0.5, "ST05"));
		lCosmetic.add(new Cosmetic("3/2/2022", "3/2/2023", "PD91", "Cosmetic91", "Origin91", 91000, 9.1, "ST05"));
		lCosmetic.add(new Cosmetic("4/2/2022", "4/2/2023", "PD92", "Cosmetic92", "Origin92", 92000, 9.2, "ST05"));
	}

	public static void CreListHouseWare() {
		lHouseware.add(new Houseware("Material1", "PD07", "Houseware07", "Origin07", 7000, 0.7, "ST07"));
		lHouseware.add(new Houseware("Material2", "PD95", "Houseware95", "Origin95", 95000, 9.5, "ST07"));
		lHouseware.add(new Houseware("Material3", "PD09", "Houseware09", "Origin09", 9000, 0.9, "ST09"));
	}

	public static void CreListOrder() {
		lOrder.add(new Order("ORD01", "DeliveryaddressA", 1, "cash", "COD", "12-12-2022"));
		lOrder.add(new Order("ORD02", "DeliveryaddressB", 2, "cash", "COD", "12-12-2022"));
		lOrder.add(new Order("ORD03", "DeliveryaddressC", 4, "cash", "COD", "12-12-2022"));
		lOrder.add(new Order("ORD04", "DeliveryaddressD", 2, "bank", "COD", "12-12-2022"));
		lOrder.add(new Order("ORD05", "DeliveryaddressE", 4, "cash", "COD", "12-12-2022"));
		lOrder.add(new Order("ORD06", "DeliveryaddressF", 1, "bank", "COD", "12-12-2022"));
		lOrder.add(new Order("ORD07", "DeliveryaddressG", 3, "bank", "COD", "12-12-2022"));

	}
	 public static void CreListOrderDetails()
     {
         lOrderDetails.add(new OrderDetails(lElectronic.get(1).dPrice * lOrder.get(2).iAmountofOrder, lOrder.get(2), lElectronic.get(1), "WH01"));
         lOrderDetails.add(new OrderDetails(lElectronic.get(2).dPrice * lOrder.get(5).iAmountofOrder, lOrder.get(5), lElectronic.get(2), "WH01"));
         lOrderDetails.add(new OrderDetails(lFashion.get(1).dPrice * lOrder.get(1).iAmountofOrder, lOrder.get(1), lFashion.get(1), "WH01"));
         lOrderDetails.add(new OrderDetails(lCosmetic.get(1).dPrice * lOrder.get(4).iAmountofOrder, lOrder.get(4), lCosmetic.get(1), "WH01"));
         lOrderDetails.add(new OrderDetails(lFood.get(1).dPrice * lOrder.get(0).iAmountofOrder, lOrder.get(0), lFood.get(1), "WH01"));
         lOrderDetails.add(new OrderDetails(lFashion.get(2).dPrice * lOrder.get(6).iAmountofOrder, lOrder.get(6), lFashion.get(2), "WH01"));
         lOrderDetails.add(new OrderDetails(lElectronic.get(0).dPrice * lOrder.get(3).iAmountofOrder, lOrder.get(3), lElectronic.get(0), "WH01"));
         
     }

	public static void CreListWareHouseManagement() 
	{
		lWareHouseManagement.add(new WareHouseManagement("WH01", "Shopee Express", "WarehouseaddressA", 7));
		lWareHouseManagement.add(new WareHouseManagement("WH02", "Ninja Van", "WarehouseaddressB", 6));
		lWareHouseManagement.add(new WareHouseManagement("WH01", "J&T Express", "WarehouseaddressC", 6));

	}


	public static void CreListShipper() {
		// lShippingInf.get(0).sShipper.iNumberOfOrdersDelivered
		lShipper.add(new Shipper(0, "EM01", "Shipper A", 7000000, "09613635380"));
		lShipper.add(new Shipper(0, "EM02", "Shipper B", 8000000, "09613635381"));
		lShipper.add(new Shipper(0, "EM03", "Shipper C", 7000000, "09613635382"));
		lShipper.add(new Shipper(0, "EM04", "Shipper D", 7000000, "09613635383"));
		lShipper.add(new Shipper(0, "EM05", "Shipper E", 8000000, "09613635384"));
		lShipper.add(new Shipper(0, "EM06", "Shipper F", 8000000, "09613635385"));
		lShipper.add(new Shipper(0, "EM07", "Shipper G", 7000000, "09613635386"));
		lShipper.add(new Shipper(0, "EM08", "Shipper H", 7000000, "09613635387"));

	}

	public static void CreListSortingEmployee() {
		lSortingEmployee.add(new SortingEmployee(8, "EM09", "SortingEmployee A", 7000000, "0962904410"));
		lSortingEmployee.add(new SortingEmployee(8, "EM10", "SortingEmployee B", 7000000, "0962904411"));
		lSortingEmployee.add(new SortingEmployee(8, "EM11", "SortingEmployee C", 8000000, "0962904412"));
		lSortingEmployee.add(new SortingEmployee(8, "EM12", "SortingEmployee D", 7000000, "0962904413"));
		lSortingEmployee.add(new SortingEmployee(8, "EM13", "SortingEmployee E", 8000000, "0962904414"));
		lSortingEmployee.add(new SortingEmployee(8, "EM14", "SortingEmployee F", 7000000, "0962904415"));
		lSortingEmployee.add(new SortingEmployee(8, "EM15", "SortingEmployee G", 8000000, "0962904416"));
		lSortingEmployee.add(new SortingEmployee(8, "EM16", "SortingEmployee H", 7000000, "0962904417"));

	}

	public static void CreListShippingInformationofTheOrder() {
		lShippingInf.add(new ShippingInformationofTheOrder("being transported", lOrder.get(0), lShipper.get(0)));
		lShippingInf.add(new ShippingInformationofTheOrder("being transported", lOrder.get(1), lShipper.get(1)));
		lShippingInf.add(new ShippingInformationofTheOrder("delivered", lOrder.get(2), lShipper.get(2)));
		lShippingInf.add(new ShippingInformationofTheOrder("being transported", lOrder.get(3), lShipper.get(0)));
		lShippingInf.add(new ShippingInformationofTheOrder("delivered", lOrder.get(4), lShipper.get(0)));
		lShippingInf.add(new ShippingInformationofTheOrder("being transported", lOrder.get(5), lShipper.get(2)));
		lShippingInf.add(new ShippingInformationofTheOrder("delivered", lOrder.get(6), lShipper.get(3)));
	}

	public static void CreListReceipt() {
		lReceipt.add(new Receipt("REC01", "15-12-2022", 20000));
		lReceipt.add(new Receipt("REC02", "16-12-2022", 15000));
		lReceipt.add(new Receipt("REC03", "17-12-2022", 20000));
		lReceipt.add(new Receipt("REC04", "18-12-2022", 20000));
		lReceipt.add(new Receipt("REC05", "18-12-2022", 10000));
		lReceipt.add(new Receipt("REC06", "21-12-2022", 20000));
		lReceipt.add(new Receipt("REC07", "22-12-2022", 30000));
	}

	public static void CreListReceiptDetails() {
		lReceiptDetails.add(new ReceiptDetails(lOrderDetails.get(0), lCustomer.get(0), lReceipt.get(0)));
		lReceiptDetails.add(new ReceiptDetails(lOrderDetails.get(1), lCustomer.get(1), lReceipt.get(1)));
		lReceiptDetails.add(new ReceiptDetails(lOrderDetails.get(2), lCustomer.get(0), lReceipt.get(2)));
		lReceiptDetails.add(new ReceiptDetails(lOrderDetails.get(3), lCustomer.get(2), lReceipt.get(3)));
		lReceiptDetails.add(new ReceiptDetails(lOrderDetails.get(4), lCustomer.get(2), lReceipt.get(4)));
		lReceiptDetails.add(new ReceiptDetails(lOrderDetails.get(5), lCustomer.get(3), lReceipt.get(5)));
		lReceiptDetails.add(new ReceiptDetails(lOrderDetails.get(6), lCustomer.get(2), lReceipt.get(6)));
	}

	public static void CreListCustomer() {
		lCustomer.add(new Customer("CT01", "Nguyen Van A", "Quang Ngai", "0123456789"));
		lCustomer.add(new Customer("CT02", "Nguyen Van B", "Binh Dinh", "0123456788"));
		lCustomer.add(new Customer("CT03", "Nguyen Van C", "Phu Yen", "0123456787"));
		lCustomer.add(new Customer("CT04", "Nguyen Van D", "Khanh Hoa", "0123456786"));
		lCustomer.add(new Customer("CT05", "Nguyen Van A", "TP.HCM", "0123456785"));
	}
	
	

	//Selection 1: Display information for each item of Product
		 public static void Selection1()
		 {
			 
			 Scanner scanner = new Scanner(System.in);
			 System.out.println("Select one option below to check: ");
			 System.out.println("1.Electronic");
			 System.out.println("2.Fashion");
			 System.out.println("3.Food");
			 System.out.println("4.Cosmetic");
			 System.out.println("5.Houseware");
			 System.out.println("Please enter your choice :");
			 int c;
			 c = scanner.nextInt();
			 switch (c) 
			 {
			 case 1:
				 {
					 for (Electronic mh : lElectronic) 
					 {
						mh.Print();
					 }
					
				 }
				 break;
			 case 2:
				 {
					 for (Fashion mh : lFashion) 
					 {
						mh.Print();
					}
				 }
				 break;
			 case 3:
				 {
					 for (Food mh : lFood) 
					 {
						mh.Print();
					}
				 }
				 break;
			 case 4:
				 {
					 for (Cosmetic mh : lCosmetic) 
					 {
						mh.Print();
					}
				 }
				 break;
			 case 5:
			 {
				 for (Houseware mh : lHouseware) 
				 {
					mh.Print();
				}
			 }
			 break;
			
			 }
		 }
		 
		
		//Selection 2: Display list of stores where the product is shipped
		 
		 public static void Selection2()
	     {
			 System.out.println("List of stores where the product is shipped: ");

			 List<Store> lst = new ArrayList<Store>();
			 for (OrderDetails ch : lOrderDetails) {
				 for (Store ch2 : lStore) {
					if (ch.pProduct.sIDStore == ch2.sIDStore)
					{
						lst.add(ch2);
						
					}
				}
				 
				
			}
			 List<Store> lst1 = lst.stream()
		                .distinct() 
		                .collect(Collectors.toList());
			 for (Store ch : lst1) {
				 System.out.println("ID STORE: " + ch.sIDStore + "-- Name STORE: " + ch.sStoreName);
				
			}

	     }
		 
		//Selection3: Check the characteristics of order
	     public static void Selection3()
	        {
	    	 System.out.println("What type of Product do you want to check the characteristic?");
	    	 System.out.println("1. Electronic");
	    	 System.out.println("2. Fashion");
	    	 System.out.println("3. Food");
	    	 System.out.println("4. Cosmetic");
	    	 System.out.println("5. Houseware");
	    	 System.out.println();
	    	 System.out.println("Please choose one option to check:");
	    	 Scanner scanner = new Scanner(System.in);
			 int c;
			 c = scanner.nextInt();
	            Product el = new Electronic();
	            Product fa = new Fashion();
	            Product fo = new Food();
	            Product co = new Cosmetic();
	            Product ho = new Houseware();
	            switch (c)
	            {
	                case 1: el.ShowCharacteristics(); break;
	                case 2: fa.ShowCharacteristics(); break;
	                case 3: fo.ShowCharacteristics(); break;
	                case 4: co.ShowCharacteristics(); break;
	                case 5: ho.ShowCharacteristics(); break;
	            }

	        }
		 //Selection 4:  Display list of orders and look up Order through IDOrder
		 public static void Selection4()
		 {
			 Scanner scanner = new Scanner(System.in);
			 String strID;
			 int dem = 0;
			 System.out.println("List ID Order: ");
			 for (Order a : lOrder) {
				 System.out.println("--" + a.sIDOrder + "--");
			}
			 System.out.println("Please enter ID Order to check:");
			 strID = scanner.nextLine();
			 for (Order x : lOrder) 
				 {
				 
					if(x.sIDOrder.equals(strID))
					{
						System.out.println("true");
						x.PrintInformOrder();
						dem++;
						break;
					}
				 }
			 
			 if (dem == 0)
				 System.out.println("Not Found!");
			 else 
			 {
				int c;
				System.out.println("Do you want to check details of order?");
				System.out.println("1.Yes");
				System.out.println("2.No");
				System.out.println("Please choose one option:");
	            c = scanner.nextInt();
	            switch (c)
	            {
	            case 1:
		            {
		            	for (OrderDetails a : lOrderDetails) {
							if (strID.equals(a.oOrder.sIDOrder) )
							{
								System.out.println("-----------------------------");
								System.out.println("ID Order: " + a.oOrder.sIDOrder);
								System.out.println("Product Name: " + a.pProduct.sProductName);
								System.out.println("Amount of Product: " + a.oOrder.iAmountofOrder);
								System.out.println("Price of Product: " + a.pProduct.dPrice);
								System.out.println("Price of Order: " + a.dOrderPrice);
								System.out.println("Delivery Address: " + a.oOrder.sDeliveryAddress);
								System.out.println("Payment method:" + a.oOrder.sPayment);
								System.out.println("Order creation date: " + a.oOrder.sOrderDate);
								System.out.println("ID warehouse: " + a.sIDWarehouse);
								System.out.println("------------------------------");
							}
						}
		            }
		            break;
	            case 2:
	            {
	            	System.out.println("Press any button to return the menu!");
	            }
	            	break;
	            }
			}
		 }
		//Selection 5: Display the names of the deliver company and the total number of employee company's
		 public static void Selection5()
	     {
			 System.out.println("List of delivery companies: ");
			 for (WareHouseManagement gh : lWareHouseManagement) {
				 System.out.println("Ten: " + gh.sWarehouseName + " - SLNV: " + gh.iTotalEmployee);
			}
			 
	         
	     }
		 
		//Selection 6: Displays the total number of orders delivered and the total number of orders demaining in stock
		 public static void Selection6()
	     {
			 int soDonHangDagiao = 0;
			 for (ShippingInformationofTheOrder dh : lShippingInf) {
				if (dh.sOrderStatus == "delivered")
					soDonHangDagiao++;
			}
	         
	         int soDonHang = lShippingInf.size();
	         
	         int soDonHangConLai = soDonHang - soDonHangDagiao;
	         System.out.println("Total orders: " + soDonHang + "\n");

	         System.out.println("Total orders deliveried: " + soDonHangDagiao + "\n");
	         System.out.println("Total orders demaining: " + soDonHangConLai + "\n");
	     }
		 

	     //Selection 7: Check information of employees (profile, salary,...)
	     public static void Selection7()
	     {
	    	 Scanner scanner = new Scanner(System.in);
	    	 int c;
	    	
	    	 System.out.println("What type of employee do you want to check information?");
	    	 System.out.println("1.Shipper");
	    	 System.out.println("2.Sorting employee");
	    	 c = scanner.nextInt();
	    	 switch(c)
	    	 {
	    		 case 1: 
	    		 {
	    			 for (Shipper nv : lShipper) {
	    				 nv.PrintInformEmployee();
						
					}
	    		 }
	    		 break;
	    		 case 2:
	    		 {
	    			 for (SortingEmployee nv : lSortingEmployee) {
	    				 nv.PrintInformEmployee();
						
					}
	    		 }
	    		 break;
	    	 }
	    }
	     
	   //Selection 8: Arrange salary of employees
	     
	     public static void CAU8_1()
	     {
	    	 Scanner scanner = new Scanner(System.in);
	         int c;
	         
	         System.out.println();
	         System.out.println("Do you want to check salary is increasing or decreasing?: ");
	         System.out.println("1.Decreasing");
	         System.out.println("2.Increasing");
	         System.out.println("Please choose one option:");
	        
	         System.out.println("Job information of shipper after being sorted: ");
	         
	         c = scanner.nextInt();
	    	 switch(c)
	    	 {
		    	 case 1:
			         {
			
			        	 Collections.sort(lShipper, new DecreasingSalaryComparator());
			        	 for (Shipper nv : lShipper) 
			        	 {
							 nv.PrintInformEmployee();
							
						}
			         }
			         break;
	             case 2:
	                 {

	                	 Collections.sort(lShipper, new AscendingSalaryComparator());
							
	                	 for (Shipper nv : lShipper) {
	        				 nv.PrintInformEmployee();
	    					
	    				}
	                 }
	                 break;

	         }
	    	 double max = lShipper.get(0).Salary();
	    	 for (int i = 1; i < lShipper.size(); i++) {
	    			
	    			if (lShipper.get(i).Salary() > max) {
	    				max = lShipper.get(i).Salary();
	    			}
	    		}
	    	 System.out.println("------------------------------------------------");
	    	 System.out.println("The shipper with the highest salary is : ");
	    	 for (Shipper nv : lShipper) {
				 if (nv.Salary() == max)
				 {
					 System.out.println("ID Shipper: " + nv.sIDEmployee + " ---- Name: " + nv.sEmployeeName);
	               System.out.println("------------------------------------------------");
				 }
					 
				
			}

	     }
	     
	     
	     public static void CAU8_2()
	     {
	    	 Scanner scanner = new Scanner(System.in);
	         int c;
	        
	         System.out.println();
	         System.out.println("Do you want to check salary is increasing or decreasing?: ");
	         System.out.println("1.Decreasing");
	         System.out.println("2.Increasing");
	         System.out.println("Please choose one option:");
	        
	         System.out.println("Job information of shipper after being sorted: ");
	         
	         c = scanner.nextInt();
	    	 switch(c)
	    	 {
		    	 case 1:
			         {
			
			        	 Collections.sort(lSortingEmployee, new DecreasingSalaryComparator());
			        	 for (Employee nv : lSortingEmployee) 
			        	 {
							 nv.PrintInformEmployee();
							
						}
			         }
			         break;
	             case 2:
	                 {

	                	 Collections.sort(lSortingEmployee, new AscendingSalaryComparator());
							
	                	 for (SortingEmployee nv : lSortingEmployee) {
	        				 nv.PrintInformEmployee();
	    					
	    				}
	                 }
	                 break;

	         }
	    	 double max = lSortingEmployee.get(0).Salary();
	    	 for (int i = 1; i < lSortingEmployee.size(); i++) {
	    			
	    			if (lSortingEmployee.get(i).Salary() > max) {
	    				max = lSortingEmployee.get(i).Salary();
	    			}
	    		}
	    	 System.out.println("------------------------------------------------");
	    	 System.out.println("The sorting employee with the highest salary is: ");
	    	 for (SortingEmployee nv : lSortingEmployee) {
				 if (nv.Salary() == max)
				 {
					 System.out.println("ID Shipper: " + nv.sIDEmployee + " ---- Name: " + nv.sEmployeeName);
	               System.out.println("------------------------------------------------");
				 }
					 
				
			}
	     }

	     public static void Selection8()
	     {
	    	 Scanner scanner = new Scanner(System.in);
	         int c;
	         System.out.println("What type of salary employee do you want to check? ");

	         System.out.println("1.Shipper");
	         System.out.println("2.Sorting Employee");
	         System.out.println("Please choose one option:");
	         c = scanner.nextInt();
	         switch (c)
	         {
	             case 1:
	                 CAU8_1();
	                 break;
	             case 2:
	                 CAU8_2();
	                 break;
	         }

	     }

		//Selection 9: Look up order information
		public static void Selection9()
		{
			
			for(Receipt rc : lReceipt)
			{
				rc.PrintReceipt();
			}
			System.out.println();
			System.out.println("Please enter your ID Receipt to check:");
			String str;
			Scanner scanner = new Scanner(System.in);
			str = scanner.nextLine();
			int dem = 0;
			for(Receipt check : lReceipt)
			{
				if(check.sIDReceipt.equals(str))
				{
					check.PrintReceipt();
					dem++;
				}
			}
			if(dem==0)
			{
				System.out.println("Not Found!");
			}
		}
		
		//Selection 10: Display list of customers and look up customer through IDCustomer or NumberPhone of Customer
		public static void Selection10()
		{
			for(Customer ct : lCustomer)
			{
				ct.PrintCustomer();
			}
			System.out.println();
			System.out.println("Please enter your IDCustomer or IDPhoneNumber:");
			String str;
			Scanner scanner = new Scanner(System.in);
			str = scanner.nextLine();
			int dem = 0;
			for(Customer check : lCustomer)
			{
				if(check.sIDCustomer.equals(str) || check.sCustomerPhoneNumber.equals(str))
				{
					check.PrintCustomer();
					dem++;
				}
			}
			if(dem==0)
			{
				System.out.println("Not found!");
			}
		}
		
		//Selection11: Look up and display all inform of OrderDetails, Customer and Receipt
		public static void Selection11()
		{
			String str;
			System.out.println("Please enter your IDOrder or IDCustomer to check:");
			Scanner scanner = new Scanner(System.in);
			str = scanner.nextLine();
			int dem = 0;
			for(ReceiptDetails check : lReceiptDetails)
			{
				if(check.cCustomer.sIDCustomer.equals(str) || check.oOrderDetails.oOrder.sIDOrder.equals(str))
				{
					System.out.println();
					check.cCustomer.PrintCustomer();
					check.oOrderDetails.pProduct.Print();
					check.rReceipt.PrintReceipt();
					check.oOrderDetails.oOrder.PrintInformOrder();
					System.out.println();
					dem++;
				}
			}
			if(dem==0)
			{
				System.out.println("Not Found!");
			}
		}
		
		//Selection 12: Directly check information of employee through EmployeeName
        public static void Selection12()
        {
        	Scanner scanner = new Scanner(System.in);
        	String str;
			System.out.println("Please enter the employee name you want to check:");
			
			str = scanner.nextLine();
            
            int dem = 0;
            for (Shipper nv : lShipper) 
            {
            	nv.iSearch = 0;
				nv.Search(str);
				if (nv.iSearch != 0)
                {
                    
                    dem++;
                }
			}
           
            for (SortingEmployee nv : lSortingEmployee) 
            {
            	nv.iSearch = 0;
				nv.Search(str);	
				if (nv.iSearch != 0)
                {
                    
                    dem++;
                }
			}
           
            if (dem == 0)
            	System.out.println("Not found the employee name in list!");
        }
      //Selection 13: Directly check information of customer through CustomerName
        public static void Selection13()
        {
        	Scanner scanner = new Scanner(System.in);
        	String str;
			System.out.println("Please enter the customer name you want to check:");
			
			str = scanner.nextLine();
            
            int dem = 0;
            System.out.println("Information of Customer:");
            for (Customer kh : lCustomer) 
            {
            	kh.demten = 0;
				kh.Search(str);	
				if (kh.demten != 0)
                {
                    
                    dem++;
                }
			}
           
            if (dem == 0)
            	System.out.println("Not found the customer name in list!");
               
        }
        
        public static void duyetDonHang()
        {
        	for (ShippingInformationofTheOrder a : lShippingInf) {
				a.xuly();
			}
        }
		//Selection 14: User can add an object into the list receipt
		public static void Selection14()
		{
			for(Receipt rc : lReceipt)
			{
				System.out.println(rc.sIDReceipt + " " + rc.sDateCreated+ " " + rc.dDeliveryFree);
			}
			
			System.out.println();
			System.out.println("Please enter full the information of list receipt");
			System.out.println("Please enter ID Receipt:");
			String id;
			Scanner scanner = new Scanner(System.in);
			id = scanner.nextLine();
			
			System.out.println("Please enter create date:");
			String date;
			date = scanner.nextLine();
			
			System.out.println("Plese enter receipt fee:");
			double fee;
			fee = scanner.nextDouble();
			
			lReceipt.add(new Receipt (id,date,fee));
			System.out.println("Full list receipt after updated: ");
			lReceipt.forEach(x -> System.out.println(x.sIDReceipt +" "+ x.sDateCreated+" "+x.dDeliveryFree));
			
		}
		//Selection 15: User can remove a receipt from list
		public static void Selection15()
		{
			for(Receipt rc : lReceipt)
			{
				System.out.println(rc.sIDReceipt + " " + rc.sDateCreated+ " " + rc.dDeliveryFree);
			}
			System.out.println();
			System.out.println("Please enter number index you want to remove from list:");
			int index;
			Scanner scanner = new Scanner(System.in);
			index = scanner.nextInt();
			lReceipt.remove(index);
			//lambda expression
			lReceipt.forEach(x->System.out.println(x.sIDReceipt+" "+x.sDateCreated+" "+x.dDeliveryFree));
			
		}
		
		public static void main(String[] args) 
		{
			try 
			{
				CreListCustomer();
		        CreListStore();
		        CreListElectronic();
		        CreListFashion();
		        CreListFood();
		        CreListCosmetic();
		        CreListOrder();
		        CreListHouseWare();
		        CreListOrderDetails();
		        CreListWareHouseManagement();
		        CreListShipper();
		        CreListSortingEmployee();
		        CreListShippingInformationofTheOrder();
		        CreListReceipt();
		        CreListReceiptDetails();
		        duyetDonHang();
		        
		        int select;
	            do
	            {
	                System.out.println();
	                System.out.println("--------------WELCOME TO DELIVERY MANAGER APPLICATION OF GROUP 08--------------------");
	                System.out.println();
	                System.out.println("Selection 1:  Display information for each item of Product.");
	                System.out.println("Selection 2:  Display list of stores where the product is shipped.");
	                System.out.println("Selection 3:  Check the characteristics of order.");
	                System.out.println("Selection 4:  Display list of orders and look up Order through IDOrder");
	                System.out.println("Selection 5:  Display the names of the deliver company and the total number of employee company's ");
	                System.out.println("Selection 6:  Display the total number of orders delivered and the total number of orders demaining in stock");
	                System.out.println("Selection 7:  Check information of employees");
	                System.out.println("Selection 8:  Arrange salary of employees");
	                System.out.println("Selection 9:  Look up receipt information");
	                System.out.println("Selection 10: Display list of customers and look up customer through IDCustomer or NumberPhone of Customer");
	                System.out.println("Selection 11: Look up and display all inform of OrderDetails, Customer and Receipt ");
	                System.out.println("Selection 12: Directly check information of employee through EmployeeName");
	                System.out.println("Selection 13: Directly check information of customer through EmployeeName");
	                System.out.println("Selection 14: User can add an object into the list receipt");
	                System.out.println("Selection 15: User can remove a receipt from list");
	                System.out.println("Selection 0: Exit Program");
	                System.out.println("*****And press any button to return the menu!*****");
	                System.out.println("----------------------------------------------------------------");
	                do
	                {
	                    System.out.println("Please enter one option (from 0 to 15) from the keyboard to check:");
	                    Scanner scanner = new Scanner(System.in);
	                    select = scanner.nextInt();
	                    //select = Convert.ToInt32(Console.ReadLine());
	                } while (select < 0 || select > 15);

	                System.out.println();

	                switch (select)
	                {
	                    case 1: Selection1(); break;
	                    case 2: Selection2(); break;
	                    case 3: Selection3(); break;
	                    case 4: Selection4(); break;
	                    case 5: Selection5(); break;
	                    case 6: Selection6(); break;
	                    case 7: Selection7(); break;
	                    case 8: Selection8(); break;
	                    case 9: Selection9(); break;
	                    case 10: Selection10(); break;
	                    case 11: Selection11(); break;
	                    case 12: Selection12();break;
	                    case 13: Selection13();break;
	                    case 14: Selection14();break;
	                    case 15: Selection15();break;
	                    case 0:  
	                    	{
	                    		System.out.println("THE END!");
	                    		System.exit(0);
	                    	}break;
	                    	

	                }
	                if (select >= 0 && select <= 15)
	                {
	                	try {
							System.in.read();
						} catch (IOException e) {
							e.printStackTrace();
						}
	                    System.out.flush();
	                }
	            } while (select >= 0 && select <= 15);
			} catch (Exception e) {
				System.out.println("Error!" + e);
			}
			try {
				System.in.read();
			} catch (IOException e) {
				e.printStackTrace();
			}
        }
}


	