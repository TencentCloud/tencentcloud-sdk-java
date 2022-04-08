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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RouteInfo extends AbstractModel{

    /**
    * 无
    */
    @SerializedName("RouteID")
    @Expose
    private Long RouteID;

    /**
    * 无
    */
    @SerializedName("RouteName")
    @Expose
    private String RouteName;

    /**
    * 无
    */
    @SerializedName("SourceProductID")
    @Expose
    private String SourceProductID;

    /**
    * 无
    */
    @SerializedName("TopicFilter")
    @Expose
    private String TopicFilter;

    /**
    * 无
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 无
    */
    @SerializedName("TargetOptions")
    @Expose
    private String TargetOptions;

    /**
    * 无
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 无
    */
    @SerializedName("Descript")
    @Expose
    private String Descript;

    /**
    * 无
    */
    @SerializedName("Healthy")
    @Expose
    private String Healthy;

    /**
    * 无
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 无
    */
    @SerializedName("MessageCount")
    @Expose
    private Long MessageCount;

    /**
    * 无
    */
    @SerializedName("MessageLastTime")
    @Expose
    private String MessageLastTime;

    /**
    * 无
    */
    @SerializedName("SourceProductName")
    @Expose
    private String SourceProductName;

    /**
    * 无
    */
    @SerializedName("SourceUnitIDList")
    @Expose
    private String [] SourceUnitIDList;

    /**
    * 无
    */
    @SerializedName("SourceUnitNameList")
    @Expose
    private String [] SourceUnitNameList;

    /**
    * 无
    */
    @SerializedName("SourceDeviceNameList")
    @Expose
    private String [] SourceDeviceNameList;

    /**
     * Get 无 
     * @return RouteID 无
     */
    public Long getRouteID() {
        return this.RouteID;
    }

    /**
     * Set 无
     * @param RouteID 无
     */
    public void setRouteID(Long RouteID) {
        this.RouteID = RouteID;
    }

    /**
     * Get 无 
     * @return RouteName 无
     */
    public String getRouteName() {
        return this.RouteName;
    }

    /**
     * Set 无
     * @param RouteName 无
     */
    public void setRouteName(String RouteName) {
        this.RouteName = RouteName;
    }

    /**
     * Get 无 
     * @return SourceProductID 无
     */
    public String getSourceProductID() {
        return this.SourceProductID;
    }

    /**
     * Set 无
     * @param SourceProductID 无
     */
    public void setSourceProductID(String SourceProductID) {
        this.SourceProductID = SourceProductID;
    }

    /**
     * Get 无 
     * @return TopicFilter 无
     */
    public String getTopicFilter() {
        return this.TopicFilter;
    }

    /**
     * Set 无
     * @param TopicFilter 无
     */
    public void setTopicFilter(String TopicFilter) {
        this.TopicFilter = TopicFilter;
    }

    /**
     * Get 无 
     * @return Mode 无
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 无
     * @param Mode 无
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 无 
     * @return TargetOptions 无
     */
    public String getTargetOptions() {
        return this.TargetOptions;
    }

    /**
     * Set 无
     * @param TargetOptions 无
     */
    public void setTargetOptions(String TargetOptions) {
        this.TargetOptions = TargetOptions;
    }

    /**
     * Get 无 
     * @return CreateTime 无
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 无
     * @param CreateTime 无
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 无 
     * @return Descript 无
     */
    public String getDescript() {
        return this.Descript;
    }

    /**
     * Set 无
     * @param Descript 无
     */
    public void setDescript(String Descript) {
        this.Descript = Descript;
    }

    /**
     * Get 无 
     * @return Healthy 无
     */
    public String getHealthy() {
        return this.Healthy;
    }

    /**
     * Set 无
     * @param Healthy 无
     */
    public void setHealthy(String Healthy) {
        this.Healthy = Healthy;
    }

    /**
     * Get 无 
     * @return Status 无
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 无
     * @param Status 无
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 无 
     * @return MessageCount 无
     */
    public Long getMessageCount() {
        return this.MessageCount;
    }

    /**
     * Set 无
     * @param MessageCount 无
     */
    public void setMessageCount(Long MessageCount) {
        this.MessageCount = MessageCount;
    }

    /**
     * Get 无 
     * @return MessageLastTime 无
     */
    public String getMessageLastTime() {
        return this.MessageLastTime;
    }

    /**
     * Set 无
     * @param MessageLastTime 无
     */
    public void setMessageLastTime(String MessageLastTime) {
        this.MessageLastTime = MessageLastTime;
    }

    /**
     * Get 无 
     * @return SourceProductName 无
     */
    public String getSourceProductName() {
        return this.SourceProductName;
    }

    /**
     * Set 无
     * @param SourceProductName 无
     */
    public void setSourceProductName(String SourceProductName) {
        this.SourceProductName = SourceProductName;
    }

    /**
     * Get 无 
     * @return SourceUnitIDList 无
     */
    public String [] getSourceUnitIDList() {
        return this.SourceUnitIDList;
    }

    /**
     * Set 无
     * @param SourceUnitIDList 无
     */
    public void setSourceUnitIDList(String [] SourceUnitIDList) {
        this.SourceUnitIDList = SourceUnitIDList;
    }

    /**
     * Get 无 
     * @return SourceUnitNameList 无
     */
    public String [] getSourceUnitNameList() {
        return this.SourceUnitNameList;
    }

    /**
     * Set 无
     * @param SourceUnitNameList 无
     */
    public void setSourceUnitNameList(String [] SourceUnitNameList) {
        this.SourceUnitNameList = SourceUnitNameList;
    }

    /**
     * Get 无 
     * @return SourceDeviceNameList 无
     */
    public String [] getSourceDeviceNameList() {
        return this.SourceDeviceNameList;
    }

    /**
     * Set 无
     * @param SourceDeviceNameList 无
     */
    public void setSourceDeviceNameList(String [] SourceDeviceNameList) {
        this.SourceDeviceNameList = SourceDeviceNameList;
    }

    public RouteInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RouteInfo(RouteInfo source) {
        if (source.RouteID != null) {
            this.RouteID = new Long(source.RouteID);
        }
        if (source.RouteName != null) {
            this.RouteName = new String(source.RouteName);
        }
        if (source.SourceProductID != null) {
            this.SourceProductID = new String(source.SourceProductID);
        }
        if (source.TopicFilter != null) {
            this.TopicFilter = new String(source.TopicFilter);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.TargetOptions != null) {
            this.TargetOptions = new String(source.TargetOptions);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Descript != null) {
            this.Descript = new String(source.Descript);
        }
        if (source.Healthy != null) {
            this.Healthy = new String(source.Healthy);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.MessageCount != null) {
            this.MessageCount = new Long(source.MessageCount);
        }
        if (source.MessageLastTime != null) {
            this.MessageLastTime = new String(source.MessageLastTime);
        }
        if (source.SourceProductName != null) {
            this.SourceProductName = new String(source.SourceProductName);
        }
        if (source.SourceUnitIDList != null) {
            this.SourceUnitIDList = new String[source.SourceUnitIDList.length];
            for (int i = 0; i < source.SourceUnitIDList.length; i++) {
                this.SourceUnitIDList[i] = new String(source.SourceUnitIDList[i]);
            }
        }
        if (source.SourceUnitNameList != null) {
            this.SourceUnitNameList = new String[source.SourceUnitNameList.length];
            for (int i = 0; i < source.SourceUnitNameList.length; i++) {
                this.SourceUnitNameList[i] = new String(source.SourceUnitNameList[i]);
            }
        }
        if (source.SourceDeviceNameList != null) {
            this.SourceDeviceNameList = new String[source.SourceDeviceNameList.length];
            for (int i = 0; i < source.SourceDeviceNameList.length; i++) {
                this.SourceDeviceNameList[i] = new String(source.SourceDeviceNameList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RouteID", this.RouteID);
        this.setParamSimple(map, prefix + "RouteName", this.RouteName);
        this.setParamSimple(map, prefix + "SourceProductID", this.SourceProductID);
        this.setParamSimple(map, prefix + "TopicFilter", this.TopicFilter);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "TargetOptions", this.TargetOptions);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Descript", this.Descript);
        this.setParamSimple(map, prefix + "Healthy", this.Healthy);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "MessageCount", this.MessageCount);
        this.setParamSimple(map, prefix + "MessageLastTime", this.MessageLastTime);
        this.setParamSimple(map, prefix + "SourceProductName", this.SourceProductName);
        this.setParamArraySimple(map, prefix + "SourceUnitIDList.", this.SourceUnitIDList);
        this.setParamArraySimple(map, prefix + "SourceUnitNameList.", this.SourceUnitNameList);
        this.setParamArraySimple(map, prefix + "SourceDeviceNameList.", this.SourceDeviceNameList);

    }
}

