Feature: Dress Purchasing

Background:

When user Enter The Username In Username Field

And user Enter The Password In Password Field

Then user Click On The Login Button And It Navigates to the My Account Page

@CasualDress
Scenario: Casual Dress

When user Click On The Casual Dresses Text And It Navigates To the Casual Dresses Page

And user Choose The Dress And Click On The Quick View

And user Select The Quantity

And user Select Size

And user Click On Add To Cart Button And It Navigates To Proceed To Checkout page

And user Click On Proceed To Checkout Button And It Navigates To Order Page

And user Click On Proceed To Checkout Button And It Navigates To Address Field

And user Click On Proceed To Checkout Button And It Navigates To Shipping Field

And user Check On Agree Button

And user Click On Proceed To Checkout Button And It Navigates To Payment Field

And user Click On Pay By Bank Wire Link To Make The Payment

Then user Click On I Confirm My Order Button


@EveningDress
Scenario: Evening Dress

When user Click On The Evening Dresses Text And It Navigates To the Evening Dresses Page

And user Choose The Dress And Click On The Quick View

And user Select The Quantity

And user Select Size

And user Select The Color

And user Click On Add To Cart Button And It Navigates To Proceed To Checkout page

And user Click On Proceed To Checkout Button And It Navigates To Order Page

And user Click On Proceed To Checkout Button And It Navigates To Address Field

And user Click On Proceed To Checkout Button And It Navigates To Shipping Field

And user Check On Agree Button

And user Click On Proceed To Checkout Button And It Navigates To Payment Field

And user Click On Pay By Cheque Link To Make The Payment

Then user Click On I Confirm My Order Button
