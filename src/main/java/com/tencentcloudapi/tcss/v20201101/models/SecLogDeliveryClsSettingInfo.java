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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecLogDeliveryClsSettingInfo extends AbstractModel {

    /**
    * 日志类型
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * 投递状态(true:开启 false:关闭)
    */
    @SerializedName("State")
    @Expose
    private Boolean State;

    /**
    * 区域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 日志集
    */
    @SerializedName("LogSet")
    @Expose
    private String LogSet;

    /**
    * 主题ID
    */
    @SerializedName("TopicID")
    @Expose
    private String TopicID;

    /**
    * 日志集名称
    */
    @SerializedName("LogSetName")
    @Expose
    private String LogSetName;

    /**
    * 主题名称
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 日志类型	
    */
    @SerializedName("SubLogType")
    @Expose
    private String [] SubLogType;

    /**
    * 错误信息
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
     * Get 日志类型 
     * @return LogType 日志类型
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set 日志类型
     * @param LogType 日志类型
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get 投递状态(true:开启 false:关闭) 
     * @return State 投递状态(true:开启 false:关闭)
     */
    public Boolean getState() {
        return this.State;
    }

    /**
     * Set 投递状态(true:开启 false:关闭)
     * @param State 投递状态(true:开启 false:关闭)
     */
    public void setState(Boolean State) {
        this.State = State;
    }

    /**
     * Get 区域 
     * @return Region 区域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 区域
     * @param Region 区域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 日志集 
     * @return LogSet 日志集
     */
    public String getLogSet() {
        return this.LogSet;
    }

    /**
     * Set 日志集
     * @param LogSet 日志集
     */
    public void setLogSet(String LogSet) {
        this.LogSet = LogSet;
    }

    /**
     * Get 主题ID 
     * @return TopicID 主题ID
     */
    public String getTopicID() {
        return this.TopicID;
    }

    /**
     * Set 主题ID
     * @param TopicID 主题ID
     */
    public void setTopicID(String TopicID) {
        this.TopicID = TopicID;
    }

    /**
     * Get 日志集名称 
     * @return LogSetName 日志集名称
     */
    public String getLogSetName() {
        return this.LogSetName;
    }

    /**
     * Set 日志集名称
     * @param LogSetName 日志集名称
     */
    public void setLogSetName(String LogSetName) {
        this.LogSetName = LogSetName;
    }

    /**
     * Get 主题名称 
     * @return TopicName 主题名称
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 主题名称
     * @param TopicName 主题名称
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 日志类型	 
     * @return SubLogType 日志类型	
     */
    public String [] getSubLogType() {
        return this.SubLogType;
    }

    /**
     * Set 日志类型	
     * @param SubLogType 日志类型	
     */
    public void setSubLogType(String [] SubLogType) {
        this.SubLogType = SubLogType;
    }

    /**
     * Get 错误信息 
     * @return ErrMsg 错误信息
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set 错误信息
     * @param ErrMsg 错误信息
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    public SecLogDeliveryClsSettingInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecLogDeliveryClsSettingInfo(SecLogDeliveryClsSettingInfo source) {
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.State != null) {
            this.State = new Boolean(source.State);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.LogSet != null) {
            this.LogSet = new String(source.LogSet);
        }
        if (source.TopicID != null) {
            this.TopicID = new String(source.TopicID);
        }
        if (source.LogSetName != null) {
            this.LogSetName = new String(source.LogSetName);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.SubLogType != null) {
            this.SubLogType = new String[source.SubLogType.length];
            for (int i = 0; i < source.SubLogType.length; i++) {
                this.SubLogType[i] = new String(source.SubLogType[i]);
            }
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "LogSet", this.LogSet);
        this.setParamSimple(map, prefix + "TopicID", this.TopicID);
        this.setParamSimple(map, prefix + "LogSetName", this.LogSetName);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamArraySimple(map, prefix + "SubLogType.", this.SubLogType);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);

    }
}

