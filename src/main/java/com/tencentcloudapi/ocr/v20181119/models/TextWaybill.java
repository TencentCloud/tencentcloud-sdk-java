/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextWaybill extends AbstractModel {

    /**
    * <p>收件人姓名</p>
    */
    @SerializedName("RecName")
    @Expose
    private WaybillObj RecName;

    /**
    * <p>收件人手机号</p>
    */
    @SerializedName("RecNum")
    @Expose
    private WaybillObj RecNum;

    /**
    * <p>收件人地址</p>
    */
    @SerializedName("RecAddr")
    @Expose
    private WaybillObj RecAddr;

    /**
    * <p>寄件人姓名</p>
    */
    @SerializedName("SenderName")
    @Expose
    private WaybillObj SenderName;

    /**
    * <p>寄件人手机号</p>
    */
    @SerializedName("SenderNum")
    @Expose
    private WaybillObj SenderNum;

    /**
    * <p>寄件人地址</p>
    */
    @SerializedName("SenderAddr")
    @Expose
    private WaybillObj SenderAddr;

    /**
    * <p>运单号, 当同时存在 母 / 子 运单号时， 该字段为子运单号</p>
    */
    @SerializedName("WaybillNum")
    @Expose
    private WaybillObj WaybillNum;

    /**
    * <p>母运单号， 当不存在母运单号时， 该字段为不存在</p>
    */
    @SerializedName("MainWaybillNum")
    @Expose
    private WaybillObj MainWaybillNum;

    /**
     * Get <p>收件人姓名</p> 
     * @return RecName <p>收件人姓名</p>
     */
    public WaybillObj getRecName() {
        return this.RecName;
    }

    /**
     * Set <p>收件人姓名</p>
     * @param RecName <p>收件人姓名</p>
     */
    public void setRecName(WaybillObj RecName) {
        this.RecName = RecName;
    }

    /**
     * Get <p>收件人手机号</p> 
     * @return RecNum <p>收件人手机号</p>
     */
    public WaybillObj getRecNum() {
        return this.RecNum;
    }

    /**
     * Set <p>收件人手机号</p>
     * @param RecNum <p>收件人手机号</p>
     */
    public void setRecNum(WaybillObj RecNum) {
        this.RecNum = RecNum;
    }

    /**
     * Get <p>收件人地址</p> 
     * @return RecAddr <p>收件人地址</p>
     */
    public WaybillObj getRecAddr() {
        return this.RecAddr;
    }

    /**
     * Set <p>收件人地址</p>
     * @param RecAddr <p>收件人地址</p>
     */
    public void setRecAddr(WaybillObj RecAddr) {
        this.RecAddr = RecAddr;
    }

    /**
     * Get <p>寄件人姓名</p> 
     * @return SenderName <p>寄件人姓名</p>
     */
    public WaybillObj getSenderName() {
        return this.SenderName;
    }

    /**
     * Set <p>寄件人姓名</p>
     * @param SenderName <p>寄件人姓名</p>
     */
    public void setSenderName(WaybillObj SenderName) {
        this.SenderName = SenderName;
    }

    /**
     * Get <p>寄件人手机号</p> 
     * @return SenderNum <p>寄件人手机号</p>
     */
    public WaybillObj getSenderNum() {
        return this.SenderNum;
    }

    /**
     * Set <p>寄件人手机号</p>
     * @param SenderNum <p>寄件人手机号</p>
     */
    public void setSenderNum(WaybillObj SenderNum) {
        this.SenderNum = SenderNum;
    }

    /**
     * Get <p>寄件人地址</p> 
     * @return SenderAddr <p>寄件人地址</p>
     */
    public WaybillObj getSenderAddr() {
        return this.SenderAddr;
    }

    /**
     * Set <p>寄件人地址</p>
     * @param SenderAddr <p>寄件人地址</p>
     */
    public void setSenderAddr(WaybillObj SenderAddr) {
        this.SenderAddr = SenderAddr;
    }

    /**
     * Get <p>运单号, 当同时存在 母 / 子 运单号时， 该字段为子运单号</p> 
     * @return WaybillNum <p>运单号, 当同时存在 母 / 子 运单号时， 该字段为子运单号</p>
     */
    public WaybillObj getWaybillNum() {
        return this.WaybillNum;
    }

    /**
     * Set <p>运单号, 当同时存在 母 / 子 运单号时， 该字段为子运单号</p>
     * @param WaybillNum <p>运单号, 当同时存在 母 / 子 运单号时， 该字段为子运单号</p>
     */
    public void setWaybillNum(WaybillObj WaybillNum) {
        this.WaybillNum = WaybillNum;
    }

    /**
     * Get <p>母运单号， 当不存在母运单号时， 该字段为不存在</p> 
     * @return MainWaybillNum <p>母运单号， 当不存在母运单号时， 该字段为不存在</p>
     */
    public WaybillObj getMainWaybillNum() {
        return this.MainWaybillNum;
    }

    /**
     * Set <p>母运单号， 当不存在母运单号时， 该字段为不存在</p>
     * @param MainWaybillNum <p>母运单号， 当不存在母运单号时， 该字段为不存在</p>
     */
    public void setMainWaybillNum(WaybillObj MainWaybillNum) {
        this.MainWaybillNum = MainWaybillNum;
    }

    public TextWaybill() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextWaybill(TextWaybill source) {
        if (source.RecName != null) {
            this.RecName = new WaybillObj(source.RecName);
        }
        if (source.RecNum != null) {
            this.RecNum = new WaybillObj(source.RecNum);
        }
        if (source.RecAddr != null) {
            this.RecAddr = new WaybillObj(source.RecAddr);
        }
        if (source.SenderName != null) {
            this.SenderName = new WaybillObj(source.SenderName);
        }
        if (source.SenderNum != null) {
            this.SenderNum = new WaybillObj(source.SenderNum);
        }
        if (source.SenderAddr != null) {
            this.SenderAddr = new WaybillObj(source.SenderAddr);
        }
        if (source.WaybillNum != null) {
            this.WaybillNum = new WaybillObj(source.WaybillNum);
        }
        if (source.MainWaybillNum != null) {
            this.MainWaybillNum = new WaybillObj(source.MainWaybillNum);
        }
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
        this.setParamObj(map, prefix + "MainWaybillNum.", this.MainWaybillNum);

    }
}

