/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextWaybill extends AbstractModel{

    /**
    * 收件人姓名
    */
    @SerializedName("RecName")
    @Expose
    private WaybillObj RecName;

    /**
    * 收件人手机号
    */
    @SerializedName("RecNum")
    @Expose
    private WaybillObj RecNum;

    /**
    * 收件人地址
    */
    @SerializedName("RecAddr")
    @Expose
    private WaybillObj RecAddr;

    /**
    * 寄件人姓名
    */
    @SerializedName("SenderName")
    @Expose
    private WaybillObj SenderName;

    /**
    * 寄件人手机号
    */
    @SerializedName("SenderNum")
    @Expose
    private WaybillObj SenderNum;

    /**
    * 寄件人地址
    */
    @SerializedName("SenderAddr")
    @Expose
    private WaybillObj SenderAddr;

    /**
    * 运单号
    */
    @SerializedName("WaybillNum")
    @Expose
    private WaybillObj WaybillNum;

    /**
     * Get 收件人姓名 
     * @return RecName 收件人姓名
     */
    public WaybillObj getRecName() {
        return this.RecName;
    }

    /**
     * Set 收件人姓名
     * @param RecName 收件人姓名
     */
    public void setRecName(WaybillObj RecName) {
        this.RecName = RecName;
    }

    /**
     * Get 收件人手机号 
     * @return RecNum 收件人手机号
     */
    public WaybillObj getRecNum() {
        return this.RecNum;
    }

    /**
     * Set 收件人手机号
     * @param RecNum 收件人手机号
     */
    public void setRecNum(WaybillObj RecNum) {
        this.RecNum = RecNum;
    }

    /**
     * Get 收件人地址 
     * @return RecAddr 收件人地址
     */
    public WaybillObj getRecAddr() {
        return this.RecAddr;
    }

    /**
     * Set 收件人地址
     * @param RecAddr 收件人地址
     */
    public void setRecAddr(WaybillObj RecAddr) {
        this.RecAddr = RecAddr;
    }

    /**
     * Get 寄件人姓名 
     * @return SenderName 寄件人姓名
     */
    public WaybillObj getSenderName() {
        return this.SenderName;
    }

    /**
     * Set 寄件人姓名
     * @param SenderName 寄件人姓名
     */
    public void setSenderName(WaybillObj SenderName) {
        this.SenderName = SenderName;
    }

    /**
     * Get 寄件人手机号 
     * @return SenderNum 寄件人手机号
     */
    public WaybillObj getSenderNum() {
        return this.SenderNum;
    }

    /**
     * Set 寄件人手机号
     * @param SenderNum 寄件人手机号
     */
    public void setSenderNum(WaybillObj SenderNum) {
        this.SenderNum = SenderNum;
    }

    /**
     * Get 寄件人地址 
     * @return SenderAddr 寄件人地址
     */
    public WaybillObj getSenderAddr() {
        return this.SenderAddr;
    }

    /**
     * Set 寄件人地址
     * @param SenderAddr 寄件人地址
     */
    public void setSenderAddr(WaybillObj SenderAddr) {
        this.SenderAddr = SenderAddr;
    }

    /**
     * Get 运单号 
     * @return WaybillNum 运单号
     */
    public WaybillObj getWaybillNum() {
        return this.WaybillNum;
    }

    /**
     * Set 运单号
     * @param WaybillNum 运单号
     */
    public void setWaybillNum(WaybillObj WaybillNum) {
        this.WaybillNum = WaybillNum;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "RecName.", this.RecName);
        this.setParamObj(map, prefix + "RecNum.", this.RecNum);
        this.setParamObj(map, prefix + "RecAddr.", this.RecAddr);
        this.setParamObj(map, prefix + "SenderName.", this.SenderName);
        this.setParamObj(map, prefix + "SenderNum.", this.SenderNum);
        this.setParamObj(map, prefix + "SenderAddr.", this.SenderAddr);
        this.setParamObj(map, prefix + "WaybillNum.", this.WaybillNum);

    }
}

