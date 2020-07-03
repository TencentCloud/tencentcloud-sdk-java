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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutoDelStrategyInfo extends AbstractModel{

    /**
    * 用户名
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * 仓库名
    */
    @SerializedName("RepoName")
    @Expose
    private String RepoName;

    /**
    * 类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 策略值
    */
    @SerializedName("Value")
    @Expose
    private Long Value;

    /**
    * Valid
    */
    @SerializedName("Valid")
    @Expose
    private Long Valid;

    /**
    * 创建时间
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
     * Get 用户名 
     * @return Username 用户名
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set 用户名
     * @param Username 用户名
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get 仓库名 
     * @return RepoName 仓库名
     */
    public String getRepoName() {
        return this.RepoName;
    }

    /**
     * Set 仓库名
     * @param RepoName 仓库名
     */
    public void setRepoName(String RepoName) {
        this.RepoName = RepoName;
    }

    /**
     * Get 类型 
     * @return Type 类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型
     * @param Type 类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 策略值 
     * @return Value 策略值
     */
    public Long getValue() {
        return this.Value;
    }

    /**
     * Set 策略值
     * @param Value 策略值
     */
    public void setValue(Long Value) {
        this.Value = Value;
    }

    /**
     * Get Valid 
     * @return Valid Valid
     */
    public Long getValid() {
        return this.Valid;
    }

    /**
     * Set Valid
     * @param Valid Valid
     */
    public void setValid(Long Valid) {
        this.Valid = Valid;
    }

    /**
     * Get 创建时间 
     * @return CreationTime 创建时间
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set 创建时间
     * @param CreationTime 创建时间
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "RepoName", this.RepoName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Valid", this.Valid);
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);

    }
}

