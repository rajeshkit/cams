package com.cams.sealed;

public sealed class Payment permits CashPayment,UpiPayment{
}
