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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BotToken extends AbstractModel {

    /**
    * 会话名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 会话描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 会话id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 策略的开关状态
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * 会话位置
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * 会话key
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 会话匹配方式，前缀匹配、后缀匹配等
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 会话更新的时间戳
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * 场景列表，内容为空表示全部场景应用
    */
    @SerializedName("Scene")
    @Expose
    private String [] Scene;

    /**
    * 优先级
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * token有效性配置信息
    */
    @SerializedName("TokenValidation")
    @Expose
    private TokenValidation TokenValidation;

    /**
    * 1表示开启了禁用嵌套功能
    */
    @SerializedName("DisableMultiJson")
    @Expose
    private Long DisableMultiJson;

    /**
     * Get 会话名称 
     * @return Name 会话名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 会话名称
     * @param Name 会话名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 会话描述 
     * @return Description 会话描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 会话描述
     * @param Description 会话描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 会话id 
     * @return Id 会话id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 会话id
     * @param Id 会话id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 策略的开关状态 
     * @return Status 策略的开关状态
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set 策略的开关状态
     * @param Status 策略的开关状态
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * Get 会话位置 
     * @return Location 会话位置
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set 会话位置
     * @param Location 会话位置
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get 会话key 
     * @return Key 会话key
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 会话key
     * @param Key 会话key
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 会话匹配方式，前缀匹配、后缀匹配等 
     * @return Operator 会话匹配方式，前缀匹配、后缀匹配等
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 会话匹配方式，前缀匹配、后缀匹配等
     * @param Operator 会话匹配方式，前缀匹配、后缀匹配等
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 会话更新的时间戳 
     * @return Timestamp 会话更新的时间戳
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 会话更新的时间戳
     * @param Timestamp 会话更新的时间戳
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 场景列表，内容为空表示全部场景应用 
     * @return Scene 场景列表，内容为空表示全部场景应用
     */
    public String [] getScene() {
        return this.Scene;
    }

    /**
     * Set 场景列表，内容为空表示全部场景应用
     * @param Scene 场景列表，内容为空表示全部场景应用
     */
    public void setScene(String [] Scene) {
        this.Scene = Scene;
    }

    /**
     * Get 优先级 
     * @return Priority 优先级
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 优先级
     * @param Priority 优先级
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get token有效性配置信息 
     * @return TokenValidation token有效性配置信息
     */
    public TokenValidation getTokenValidation() {
        return this.TokenValidation;
    }

    /**
     * Set token有效性配置信息
     * @param TokenValidation token有效性配置信息
     */
    public void setTokenValidation(TokenValidation TokenValidation) {
        this.TokenValidation = TokenValidation;
    }

    /**
     * Get 1表示开启了禁用嵌套功能 
     * @return DisableMultiJson 1表示开启了禁用嵌套功能
     */
    public Long getDisableMultiJson() {
        return this.DisableMultiJson;
    }

    /**
     * Set 1表示开启了禁用嵌套功能
     * @param DisableMultiJson 1表示开启了禁用嵌套功能
     */
    public void setDisableMultiJson(Long DisableMultiJson) {
        this.DisableMultiJson = DisableMultiJson;
    }

    public BotToken() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotToken(BotToken source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
        if (source.Location != null) {
            this.Location = new String(source.Location);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.Scene != null) {
            this.Scene = new String[source.Scene.length];
            for (int i = 0; i < source.Scene.length; i++) {
                this.Scene[i] = new String(source.Scene[i]);
            }
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.TokenValidation != null) {
            this.TokenValidation = new TokenValidation(source.TokenValidation);
        }
        if (source.DisableMultiJson != null) {
            this.DisableMultiJson = new Long(source.DisableMultiJson);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamArraySimple(map, prefix + "Scene.", this.Scene);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamObj(map, prefix + "TokenValidation.", this.TokenValidation);
        this.setParamSimple(map, prefix + "DisableMultiJson", this.DisableMultiJson);

    }
}

