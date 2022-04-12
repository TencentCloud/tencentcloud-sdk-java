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
package com.tencentcloudapi.icr.v20211014.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReqMetadata extends AbstractModel{

    /**
    * 渠道
    */
    @SerializedName("ChannelID")
    @Expose
    private String ChannelID;

    /**
    * 无
    */
    @SerializedName("BusinessName")
    @Expose
    private String BusinessName;

    /**
    * 无
    */
    @SerializedName("GUID")
    @Expose
    private String GUID;

    /**
    * 无
    */
    @SerializedName("AppKey")
    @Expose
    private String AppKey;

    /**
    * 位置定位服务
    */
    @SerializedName("LBS")
    @Expose
    private ReqMetadataLBS LBS;

    /**
    * 透传字段
    */
    @SerializedName("Vagrants")
    @Expose
    private ReqMetadataVagrant [] Vagrants;

    /**
     * Get 渠道 
     * @return ChannelID 渠道
     */
    public String getChannelID() {
        return this.ChannelID;
    }

    /**
     * Set 渠道
     * @param ChannelID 渠道
     */
    public void setChannelID(String ChannelID) {
        this.ChannelID = ChannelID;
    }

    /**
     * Get 无 
     * @return BusinessName 无
     */
    public String getBusinessName() {
        return this.BusinessName;
    }

    /**
     * Set 无
     * @param BusinessName 无
     */
    public void setBusinessName(String BusinessName) {
        this.BusinessName = BusinessName;
    }

    /**
     * Get 无 
     * @return GUID 无
     */
    public String getGUID() {
        return this.GUID;
    }

    /**
     * Set 无
     * @param GUID 无
     */
    public void setGUID(String GUID) {
        this.GUID = GUID;
    }

    /**
     * Get 无 
     * @return AppKey 无
     */
    public String getAppKey() {
        return this.AppKey;
    }

    /**
     * Set 无
     * @param AppKey 无
     */
    public void setAppKey(String AppKey) {
        this.AppKey = AppKey;
    }

    /**
     * Get 位置定位服务 
     * @return LBS 位置定位服务
     */
    public ReqMetadataLBS getLBS() {
        return this.LBS;
    }

    /**
     * Set 位置定位服务
     * @param LBS 位置定位服务
     */
    public void setLBS(ReqMetadataLBS LBS) {
        this.LBS = LBS;
    }

    /**
     * Get 透传字段 
     * @return Vagrants 透传字段
     */
    public ReqMetadataVagrant [] getVagrants() {
        return this.Vagrants;
    }

    /**
     * Set 透传字段
     * @param Vagrants 透传字段
     */
    public void setVagrants(ReqMetadataVagrant [] Vagrants) {
        this.Vagrants = Vagrants;
    }

    public ReqMetadata() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReqMetadata(ReqMetadata source) {
        if (source.ChannelID != null) {
            this.ChannelID = new String(source.ChannelID);
        }
        if (source.BusinessName != null) {
            this.BusinessName = new String(source.BusinessName);
        }
        if (source.GUID != null) {
            this.GUID = new String(source.GUID);
        }
        if (source.AppKey != null) {
            this.AppKey = new String(source.AppKey);
        }
        if (source.LBS != null) {
            this.LBS = new ReqMetadataLBS(source.LBS);
        }
        if (source.Vagrants != null) {
            this.Vagrants = new ReqMetadataVagrant[source.Vagrants.length];
            for (int i = 0; i < source.Vagrants.length; i++) {
                this.Vagrants[i] = new ReqMetadataVagrant(source.Vagrants[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelID", this.ChannelID);
        this.setParamSimple(map, prefix + "BusinessName", this.BusinessName);
        this.setParamSimple(map, prefix + "GUID", this.GUID);
        this.setParamSimple(map, prefix + "AppKey", this.AppKey);
        this.setParamObj(map, prefix + "LBS.", this.LBS);
        this.setParamArrayObj(map, prefix + "Vagrants.", this.Vagrants);

    }
}

