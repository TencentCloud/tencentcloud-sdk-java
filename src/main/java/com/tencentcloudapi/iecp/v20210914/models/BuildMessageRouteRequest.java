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

public class BuildMessageRouteRequest extends AbstractModel{

    /**
    * 路由名字
    */
    @SerializedName("RouteName")
    @Expose
    private String RouteName;

    /**
    * 源产品id
    */
    @SerializedName("SourceProductID")
    @Expose
    private String SourceProductID;

    /**
    * 源设备名列表
    */
    @SerializedName("SourceDeviceNameList")
    @Expose
    private String [] SourceDeviceNameList;

    /**
    * 第一个字符为 "0"或"1"，"1"表示自定义topic
    */
    @SerializedName("TopicFilter")
    @Expose
    private String TopicFilter;

    /**
    * http或mqtt-broker
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 源单元id列表
    */
    @SerializedName("SourceUnitIDList")
    @Expose
    private String [] SourceUnitIDList;

    /**
    * 描述
    */
    @SerializedName("Descript")
    @Expose
    private String Descript;

    /**
    * 无
    */
    @SerializedName("TargetOptions")
    @Expose
    private String TargetOptions;

    /**
     * Get 路由名字 
     * @return RouteName 路由名字
     */
    public String getRouteName() {
        return this.RouteName;
    }

    /**
     * Set 路由名字
     * @param RouteName 路由名字
     */
    public void setRouteName(String RouteName) {
        this.RouteName = RouteName;
    }

    /**
     * Get 源产品id 
     * @return SourceProductID 源产品id
     */
    public String getSourceProductID() {
        return this.SourceProductID;
    }

    /**
     * Set 源产品id
     * @param SourceProductID 源产品id
     */
    public void setSourceProductID(String SourceProductID) {
        this.SourceProductID = SourceProductID;
    }

    /**
     * Get 源设备名列表 
     * @return SourceDeviceNameList 源设备名列表
     */
    public String [] getSourceDeviceNameList() {
        return this.SourceDeviceNameList;
    }

    /**
     * Set 源设备名列表
     * @param SourceDeviceNameList 源设备名列表
     */
    public void setSourceDeviceNameList(String [] SourceDeviceNameList) {
        this.SourceDeviceNameList = SourceDeviceNameList;
    }

    /**
     * Get 第一个字符为 "0"或"1"，"1"表示自定义topic 
     * @return TopicFilter 第一个字符为 "0"或"1"，"1"表示自定义topic
     */
    public String getTopicFilter() {
        return this.TopicFilter;
    }

    /**
     * Set 第一个字符为 "0"或"1"，"1"表示自定义topic
     * @param TopicFilter 第一个字符为 "0"或"1"，"1"表示自定义topic
     */
    public void setTopicFilter(String TopicFilter) {
        this.TopicFilter = TopicFilter;
    }

    /**
     * Get http或mqtt-broker 
     * @return Mode http或mqtt-broker
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set http或mqtt-broker
     * @param Mode http或mqtt-broker
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 源单元id列表 
     * @return SourceUnitIDList 源单元id列表
     */
    public String [] getSourceUnitIDList() {
        return this.SourceUnitIDList;
    }

    /**
     * Set 源单元id列表
     * @param SourceUnitIDList 源单元id列表
     */
    public void setSourceUnitIDList(String [] SourceUnitIDList) {
        this.SourceUnitIDList = SourceUnitIDList;
    }

    /**
     * Get 描述 
     * @return Descript 描述
     */
    public String getDescript() {
        return this.Descript;
    }

    /**
     * Set 描述
     * @param Descript 描述
     */
    public void setDescript(String Descript) {
        this.Descript = Descript;
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

    public BuildMessageRouteRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BuildMessageRouteRequest(BuildMessageRouteRequest source) {
        if (source.RouteName != null) {
            this.RouteName = new String(source.RouteName);
        }
        if (source.SourceProductID != null) {
            this.SourceProductID = new String(source.SourceProductID);
        }
        if (source.SourceDeviceNameList != null) {
            this.SourceDeviceNameList = new String[source.SourceDeviceNameList.length];
            for (int i = 0; i < source.SourceDeviceNameList.length; i++) {
                this.SourceDeviceNameList[i] = new String(source.SourceDeviceNameList[i]);
            }
        }
        if (source.TopicFilter != null) {
            this.TopicFilter = new String(source.TopicFilter);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.SourceUnitIDList != null) {
            this.SourceUnitIDList = new String[source.SourceUnitIDList.length];
            for (int i = 0; i < source.SourceUnitIDList.length; i++) {
                this.SourceUnitIDList[i] = new String(source.SourceUnitIDList[i]);
            }
        }
        if (source.Descript != null) {
            this.Descript = new String(source.Descript);
        }
        if (source.TargetOptions != null) {
            this.TargetOptions = new String(source.TargetOptions);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RouteName", this.RouteName);
        this.setParamSimple(map, prefix + "SourceProductID", this.SourceProductID);
        this.setParamArraySimple(map, prefix + "SourceDeviceNameList.", this.SourceDeviceNameList);
        this.setParamSimple(map, prefix + "TopicFilter", this.TopicFilter);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamArraySimple(map, prefix + "SourceUnitIDList.", this.SourceUnitIDList);
        this.setParamSimple(map, prefix + "Descript", this.Descript);
        this.setParamSimple(map, prefix + "TargetOptions", this.TargetOptions);

    }
}

