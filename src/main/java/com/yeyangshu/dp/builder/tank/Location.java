package com.yeyangshu.dp.builder.tank;

/**
 * 地址
 *
 * @author yeyangshu
 * @version 1.0
 * @date 2020/11/30 23:36
 */
class Location {
    /** 街道 */
    private String street;

    /** 房间号码 */
    private String roomNo;

    public Location(String street, String roomNo) {
        this.street = street;
        this.roomNo = roomNo;
    }
}
