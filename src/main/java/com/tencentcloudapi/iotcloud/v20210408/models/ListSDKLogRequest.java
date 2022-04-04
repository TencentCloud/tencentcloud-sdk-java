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
package com.tencentcloudapi.iotcloud.v20210408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListSDKLogRequest extends AbstractModel{

    /**
    * 日志开始时间
    */
    @SerializedName("MinTime")
    @Expose
    private Long MinTime;

    /**
    * 日志结束时间
    */
    @SerializedName("MaxTime")
    @Expose
    private Long MaxTime;

    /**
    * 查询关键字，可以同时支持键值查询和文本查询，
例如，查询某key的值为value，并且包含某word的日志，该参数为：key:value word。
键值或文本可以包含多个，以空格隔开。
其中可以索引的key包括：productid、devicename、loglevel
一个典型的查询示例：productid:7JK1G72JNE devicename:name publish loglevel:WARN一个典型的查询示例：productid:ABCDE12345 devicename:test scene:SHADOW publish
    */
    @SerializedName("Keywords")
    @Expose
    private String Keywords;

    /**
    * 日志检索上下文
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * 查询条数
    */
    @SerializedName("MaxNum")
    @Expose
    private Long MaxNum;

    /**
     * Get 日志开始时间 
     * @return MinTime 日志开始时间
     */
    public Long getMinTime() {
        return this.MinTime;
    }

    /**
     * Set 日志开始时间
     * @param MinTime 日志开始时间
     */
    public void setMinTime(Long MinTime) {
        this.MinTime = MinTime;
    }

    /**
     * Get 日志结束时间 
     * @return MaxTime 日志结束时间
     */
    public Long getMaxTime() {
        return this.MaxTime;
    }

    /**
     * Set 日志结束时间
     * @param MaxTime 日志结束时间
     */
    public void setMaxTime(Long MaxTime) {
        this.MaxTime = MaxTime;
    }

    /**
     * Get 查询关键字，可以同时支持键值查询和文本查询，
例如，查询某key的值为value，并且包含某word的日志，该参数为：key:value word。
键值或文本可以包含多个，以空格隔开。
其中可以索引的key包括：productid、devicename、loglevel
一个典型的查询示例：productid:7JK1G72JNE devicename:name publish loglevel:WARN一个典型的查询示例：productid:ABCDE12345 devicename:test scene:SHADOW publish 
     * @return Keywords 查询关键字，可以同时支持键值查询和文本查询，
例如，查询某key的值为value，并且包含某word的日志，该参数为：key:value word。
键值或文本可以包含多个，以空格隔开。
其中可以索引的key包括：productid、devicename、loglevel
一个典型的查询示例：productid:7JK1G72JNE devicename:name publish loglevel:WARN一个典型的查询示例：productid:ABCDE12345 devicename:test scene:SHADOW publish
     */
    public String getKeywords() {
        return this.Keywords;
    }

    /**
     * Set 查询关键字，可以同时支持键值查询和文本查询，
例如，查询某key的值为value，并且包含某word的日志，该参数为：key:value word。
键值或文本可以包含多个，以空格隔开。
其中可以索引的key包括：productid、devicename、loglevel
一个典型的查询示例：productid:7JK1G72JNE devicename:name publish loglevel:WARN一个典型的查询示例：productid:ABCDE12345 devicename:test scene:SHADOW publish
     * @param Keywords 查询关键字，可以同时支持键值查询和文本查询，
例如，查询某key的值为value，并且包含某word的日志，该参数为：key:value word。
键值或文本可以包含多个，以空格隔开。
其中可以索引的key包括：productid、devicename、loglevel
一个典型的查询示例：productid:7JK1G72JNE devicename:name publish loglevel:WARN一个典型的查询示例：productid:ABCDE12345 devicename:test scene:SHADOW publish
     */
    public void setKeywords(String Keywords) {
        this.Keywords = Keywords;
    }

    /**
     * Get 日志检索上下文 
     * @return Context 日志检索上下文
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set 日志检索上下文
     * @param Context 日志检索上下文
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get 查询条数 
     * @return MaxNum 查询条数
     */
    public Long getMaxNum() {
        return this.MaxNum;
    }

    /**
     * Set 查询条数
     * @param MaxNum 查询条数
     */
    public void setMaxNum(Long MaxNum) {
        this.MaxNum = MaxNum;
    }

    public ListSDKLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListSDKLogRequest(ListSDKLogRequest source) {
        if (source.MinTime != null) {
            this.MinTime = new Long(source.MinTime);
        }
        if (source.MaxTime != null) {
            this.MaxTime = new Long(source.MaxTime);
        }
        if (source.Keywords != null) {
            this.Keywords = new String(source.Keywords);
        }
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
        if (source.MaxNum != null) {
            this.MaxNum = new Long(source.MaxNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MinTime", this.MinTime);
        this.setParamSimple(map, prefix + "MaxTime", this.MaxTime);
        this.setParamSimple(map, prefix + "Keywords", this.Keywords);
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamSimple(map, prefix + "MaxNum", this.MaxNum);

    }
}

