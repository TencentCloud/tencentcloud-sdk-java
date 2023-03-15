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
package com.tencentcloudapi.hasim.v20210716.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLinksRequest extends AbstractModel{

    /**
    * 云兔卡ID
    */
    @SerializedName("LinkID")
    @Expose
    private Long LinkID;

    /**
    * 运营商ICCID
    */
    @SerializedName("ICCID")
    @Expose
    private String ICCID;

    /**
    * 设备码
    */
    @SerializedName("IMEI")
    @Expose
    private String IMEI;

    /**
    * 卡片状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 运营商 1移动 2联通 3电信
    */
    @SerializedName("TeleOperator")
    @Expose
    private Long TeleOperator;

    /**
    * 标签ID
    */
    @SerializedName("TagID")
    @Expose
    private Long TagID;

    /**
    * 策略ID
    */
    @SerializedName("TacticID")
    @Expose
    private Long TacticID;

    /**
    * 设备在线状态 0 未激活 1 在线 2 离线
    */
    @SerializedName("LinkedState")
    @Expose
    private Long LinkedState;

    /**
    * 标签ID 集合
    */
    @SerializedName("TagIDs")
    @Expose
    private Long [] TagIDs;

    /**
    * 翻页大小, 默认翻页大小为10，最大数量为500
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 翻页起始
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 云兔卡ID 
     * @return LinkID 云兔卡ID
     */
    public Long getLinkID() {
        return this.LinkID;
    }

    /**
     * Set 云兔卡ID
     * @param LinkID 云兔卡ID
     */
    public void setLinkID(Long LinkID) {
        this.LinkID = LinkID;
    }

    /**
     * Get 运营商ICCID 
     * @return ICCID 运营商ICCID
     */
    public String getICCID() {
        return this.ICCID;
    }

    /**
     * Set 运营商ICCID
     * @param ICCID 运营商ICCID
     */
    public void setICCID(String ICCID) {
        this.ICCID = ICCID;
    }

    /**
     * Get 设备码 
     * @return IMEI 设备码
     */
    public String getIMEI() {
        return this.IMEI;
    }

    /**
     * Set 设备码
     * @param IMEI 设备码
     */
    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    /**
     * Get 卡片状态 
     * @return Status 卡片状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 卡片状态
     * @param Status 卡片状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 运营商 1移动 2联通 3电信 
     * @return TeleOperator 运营商 1移动 2联通 3电信
     */
    public Long getTeleOperator() {
        return this.TeleOperator;
    }

    /**
     * Set 运营商 1移动 2联通 3电信
     * @param TeleOperator 运营商 1移动 2联通 3电信
     */
    public void setTeleOperator(Long TeleOperator) {
        this.TeleOperator = TeleOperator;
    }

    /**
     * Get 标签ID 
     * @return TagID 标签ID
     */
    public Long getTagID() {
        return this.TagID;
    }

    /**
     * Set 标签ID
     * @param TagID 标签ID
     */
    public void setTagID(Long TagID) {
        this.TagID = TagID;
    }

    /**
     * Get 策略ID 
     * @return TacticID 策略ID
     */
    public Long getTacticID() {
        return this.TacticID;
    }

    /**
     * Set 策略ID
     * @param TacticID 策略ID
     */
    public void setTacticID(Long TacticID) {
        this.TacticID = TacticID;
    }

    /**
     * Get 设备在线状态 0 未激活 1 在线 2 离线 
     * @return LinkedState 设备在线状态 0 未激活 1 在线 2 离线
     */
    public Long getLinkedState() {
        return this.LinkedState;
    }

    /**
     * Set 设备在线状态 0 未激活 1 在线 2 离线
     * @param LinkedState 设备在线状态 0 未激活 1 在线 2 离线
     */
    public void setLinkedState(Long LinkedState) {
        this.LinkedState = LinkedState;
    }

    /**
     * Get 标签ID 集合 
     * @return TagIDs 标签ID 集合
     */
    public Long [] getTagIDs() {
        return this.TagIDs;
    }

    /**
     * Set 标签ID 集合
     * @param TagIDs 标签ID 集合
     */
    public void setTagIDs(Long [] TagIDs) {
        this.TagIDs = TagIDs;
    }

    /**
     * Get 翻页大小, 默认翻页大小为10，最大数量为500 
     * @return Limit 翻页大小, 默认翻页大小为10，最大数量为500
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 翻页大小, 默认翻页大小为10，最大数量为500
     * @param Limit 翻页大小, 默认翻页大小为10，最大数量为500
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 翻页起始 
     * @return Offset 翻页起始
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 翻页起始
     * @param Offset 翻页起始
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeLinksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLinksRequest(DescribeLinksRequest source) {
        if (source.LinkID != null) {
            this.LinkID = new Long(source.LinkID);
        }
        if (source.ICCID != null) {
            this.ICCID = new String(source.ICCID);
        }
        if (source.IMEI != null) {
            this.IMEI = new String(source.IMEI);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.TeleOperator != null) {
            this.TeleOperator = new Long(source.TeleOperator);
        }
        if (source.TagID != null) {
            this.TagID = new Long(source.TagID);
        }
        if (source.TacticID != null) {
            this.TacticID = new Long(source.TacticID);
        }
        if (source.LinkedState != null) {
            this.LinkedState = new Long(source.LinkedState);
        }
        if (source.TagIDs != null) {
            this.TagIDs = new Long[source.TagIDs.length];
            for (int i = 0; i < source.TagIDs.length; i++) {
                this.TagIDs[i] = new Long(source.TagIDs[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LinkID", this.LinkID);
        this.setParamSimple(map, prefix + "ICCID", this.ICCID);
        this.setParamSimple(map, prefix + "IMEI", this.IMEI);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TeleOperator", this.TeleOperator);
        this.setParamSimple(map, prefix + "TagID", this.TagID);
        this.setParamSimple(map, prefix + "TacticID", this.TacticID);
        this.setParamSimple(map, prefix + "LinkedState", this.LinkedState);
        this.setParamArraySimple(map, prefix + "TagIDs.", this.TagIDs);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

