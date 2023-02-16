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
package com.tencentcloudapi.bma.v20221115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TrademarkData extends AbstractModel{

    /**
    * 商标证明
    */
    @SerializedName("Trademark")
    @Expose
    private String Trademark;

    /**
    * 商标审核状态
    */
    @SerializedName("TrademarkStatus")
    @Expose
    private Long TrademarkStatus;

    /**
    * 商标审核状态说明
    */
    @SerializedName("TrademarkNote")
    @Expose
    private String TrademarkNote;

    /**
    * 商标id
    */
    @SerializedName("TrademarkId")
    @Expose
    private Long TrademarkId;

    /**
    * 商标转让书
    */
    @SerializedName("Transfer")
    @Expose
    private String Transfer;

    /**
    * 商标转让书审核状态
    */
    @SerializedName("TransferStatus")
    @Expose
    private Long TransferStatus;

    /**
    * 商标转让书审核状态说明
    */
    @SerializedName("TransferNote")
    @Expose
    private String TransferNote;

    /**
    * 商标名称
    */
    @SerializedName("TrademarkName")
    @Expose
    private String TrademarkName;

    /**
     * Get 商标证明 
     * @return Trademark 商标证明
     */
    public String getTrademark() {
        return this.Trademark;
    }

    /**
     * Set 商标证明
     * @param Trademark 商标证明
     */
    public void setTrademark(String Trademark) {
        this.Trademark = Trademark;
    }

    /**
     * Get 商标审核状态 
     * @return TrademarkStatus 商标审核状态
     */
    public Long getTrademarkStatus() {
        return this.TrademarkStatus;
    }

    /**
     * Set 商标审核状态
     * @param TrademarkStatus 商标审核状态
     */
    public void setTrademarkStatus(Long TrademarkStatus) {
        this.TrademarkStatus = TrademarkStatus;
    }

    /**
     * Get 商标审核状态说明 
     * @return TrademarkNote 商标审核状态说明
     */
    public String getTrademarkNote() {
        return this.TrademarkNote;
    }

    /**
     * Set 商标审核状态说明
     * @param TrademarkNote 商标审核状态说明
     */
    public void setTrademarkNote(String TrademarkNote) {
        this.TrademarkNote = TrademarkNote;
    }

    /**
     * Get 商标id 
     * @return TrademarkId 商标id
     */
    public Long getTrademarkId() {
        return this.TrademarkId;
    }

    /**
     * Set 商标id
     * @param TrademarkId 商标id
     */
    public void setTrademarkId(Long TrademarkId) {
        this.TrademarkId = TrademarkId;
    }

    /**
     * Get 商标转让书 
     * @return Transfer 商标转让书
     */
    public String getTransfer() {
        return this.Transfer;
    }

    /**
     * Set 商标转让书
     * @param Transfer 商标转让书
     */
    public void setTransfer(String Transfer) {
        this.Transfer = Transfer;
    }

    /**
     * Get 商标转让书审核状态 
     * @return TransferStatus 商标转让书审核状态
     */
    public Long getTransferStatus() {
        return this.TransferStatus;
    }

    /**
     * Set 商标转让书审核状态
     * @param TransferStatus 商标转让书审核状态
     */
    public void setTransferStatus(Long TransferStatus) {
        this.TransferStatus = TransferStatus;
    }

    /**
     * Get 商标转让书审核状态说明 
     * @return TransferNote 商标转让书审核状态说明
     */
    public String getTransferNote() {
        return this.TransferNote;
    }

    /**
     * Set 商标转让书审核状态说明
     * @param TransferNote 商标转让书审核状态说明
     */
    public void setTransferNote(String TransferNote) {
        this.TransferNote = TransferNote;
    }

    /**
     * Get 商标名称 
     * @return TrademarkName 商标名称
     */
    public String getTrademarkName() {
        return this.TrademarkName;
    }

    /**
     * Set 商标名称
     * @param TrademarkName 商标名称
     */
    public void setTrademarkName(String TrademarkName) {
        this.TrademarkName = TrademarkName;
    }

    public TrademarkData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrademarkData(TrademarkData source) {
        if (source.Trademark != null) {
            this.Trademark = new String(source.Trademark);
        }
        if (source.TrademarkStatus != null) {
            this.TrademarkStatus = new Long(source.TrademarkStatus);
        }
        if (source.TrademarkNote != null) {
            this.TrademarkNote = new String(source.TrademarkNote);
        }
        if (source.TrademarkId != null) {
            this.TrademarkId = new Long(source.TrademarkId);
        }
        if (source.Transfer != null) {
            this.Transfer = new String(source.Transfer);
        }
        if (source.TransferStatus != null) {
            this.TransferStatus = new Long(source.TransferStatus);
        }
        if (source.TransferNote != null) {
            this.TransferNote = new String(source.TransferNote);
        }
        if (source.TrademarkName != null) {
            this.TrademarkName = new String(source.TrademarkName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Trademark", this.Trademark);
        this.setParamSimple(map, prefix + "TrademarkStatus", this.TrademarkStatus);
        this.setParamSimple(map, prefix + "TrademarkNote", this.TrademarkNote);
        this.setParamSimple(map, prefix + "TrademarkId", this.TrademarkId);
        this.setParamSimple(map, prefix + "Transfer", this.Transfer);
        this.setParamSimple(map, prefix + "TransferStatus", this.TransferStatus);
        this.setParamSimple(map, prefix + "TransferNote", this.TransferNote);
        this.setParamSimple(map, prefix + "TrademarkName", this.TrademarkName);

    }
}

