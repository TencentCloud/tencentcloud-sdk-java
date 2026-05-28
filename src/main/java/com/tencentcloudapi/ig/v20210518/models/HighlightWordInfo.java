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
package com.tencentcloudapi.ig.v20210518.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HighlightWordInfo extends AbstractModel {

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 类型 1:疾病，2:检验/检查，3:药品，4:科室，5:自定义配置
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 跳转类型 h5:h5类型，mini_wx:微信小程序
    */
    @SerializedName("JumpType")
    @Expose
    private String JumpType;

    /**
    * 跳转URL
    */
    @SerializedName("JumpUrl")
    @Expose
    private String JumpUrl;

    /**
    * 跳转小程序Appid
    */
    @SerializedName("JumpAppid")
    @Expose
    private String JumpAppid;

    /**
    * 跳转小程序原始ID
    */
    @SerializedName("JumpOriginId")
    @Expose
    private String JumpOriginId;

    /**
     * Get 名称 
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 类型 1:疾病，2:检验/检查，3:药品，4:科室，5:自定义配置 
     * @return Type 类型 1:疾病，2:检验/检查，3:药品，4:科室，5:自定义配置
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 类型 1:疾病，2:检验/检查，3:药品，4:科室，5:自定义配置
     * @param Type 类型 1:疾病，2:检验/检查，3:药品，4:科室，5:自定义配置
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 跳转类型 h5:h5类型，mini_wx:微信小程序 
     * @return JumpType 跳转类型 h5:h5类型，mini_wx:微信小程序
     */
    public String getJumpType() {
        return this.JumpType;
    }

    /**
     * Set 跳转类型 h5:h5类型，mini_wx:微信小程序
     * @param JumpType 跳转类型 h5:h5类型，mini_wx:微信小程序
     */
    public void setJumpType(String JumpType) {
        this.JumpType = JumpType;
    }

    /**
     * Get 跳转URL 
     * @return JumpUrl 跳转URL
     */
    public String getJumpUrl() {
        return this.JumpUrl;
    }

    /**
     * Set 跳转URL
     * @param JumpUrl 跳转URL
     */
    public void setJumpUrl(String JumpUrl) {
        this.JumpUrl = JumpUrl;
    }

    /**
     * Get 跳转小程序Appid 
     * @return JumpAppid 跳转小程序Appid
     */
    public String getJumpAppid() {
        return this.JumpAppid;
    }

    /**
     * Set 跳转小程序Appid
     * @param JumpAppid 跳转小程序Appid
     */
    public void setJumpAppid(String JumpAppid) {
        this.JumpAppid = JumpAppid;
    }

    /**
     * Get 跳转小程序原始ID 
     * @return JumpOriginId 跳转小程序原始ID
     */
    public String getJumpOriginId() {
        return this.JumpOriginId;
    }

    /**
     * Set 跳转小程序原始ID
     * @param JumpOriginId 跳转小程序原始ID
     */
    public void setJumpOriginId(String JumpOriginId) {
        this.JumpOriginId = JumpOriginId;
    }

    public HighlightWordInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HighlightWordInfo(HighlightWordInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.JumpType != null) {
            this.JumpType = new String(source.JumpType);
        }
        if (source.JumpUrl != null) {
            this.JumpUrl = new String(source.JumpUrl);
        }
        if (source.JumpAppid != null) {
            this.JumpAppid = new String(source.JumpAppid);
        }
        if (source.JumpOriginId != null) {
            this.JumpOriginId = new String(source.JumpOriginId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "JumpType", this.JumpType);
        this.setParamSimple(map, prefix + "JumpUrl", this.JumpUrl);
        this.setParamSimple(map, prefix + "JumpAppid", this.JumpAppid);
        this.setParamSimple(map, prefix + "JumpOriginId", this.JumpOriginId);

    }
}

