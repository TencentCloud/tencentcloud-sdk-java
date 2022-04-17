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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IpHitItem extends AbstractModel{

    /**
    * 动作
    */
    @SerializedName("Action")
    @Expose
    private Long Action;

    /**
    * 类别
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * ip
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 规则名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 时间戳
    */
    @SerializedName("TsVersion")
    @Expose
    private Long TsVersion;

    /**
    * 有效截止时间戳
    */
    @SerializedName("ValidTs")
    @Expose
    private Long ValidTs;

    /**
     * Get 动作 
     * @return Action 动作
     */
    public Long getAction() {
        return this.Action;
    }

    /**
     * Set 动作
     * @param Action 动作
     */
    public void setAction(Long Action) {
        this.Action = Action;
    }

    /**
     * Get 类别 
     * @return Category 类别
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set 类别
     * @param Category 类别
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get ip 
     * @return Ip ip
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set ip
     * @param Ip ip
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 规则名称 
     * @return Name 规则名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 规则名称
     * @param Name 规则名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 时间戳 
     * @return TsVersion 时间戳
     */
    public Long getTsVersion() {
        return this.TsVersion;
    }

    /**
     * Set 时间戳
     * @param TsVersion 时间戳
     */
    public void setTsVersion(Long TsVersion) {
        this.TsVersion = TsVersion;
    }

    /**
     * Get 有效截止时间戳 
     * @return ValidTs 有效截止时间戳
     */
    public Long getValidTs() {
        return this.ValidTs;
    }

    /**
     * Set 有效截止时间戳
     * @param ValidTs 有效截止时间戳
     */
    public void setValidTs(Long ValidTs) {
        this.ValidTs = ValidTs;
    }

    public IpHitItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IpHitItem(IpHitItem source) {
        if (source.Action != null) {
            this.Action = new Long(source.Action);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TsVersion != null) {
            this.TsVersion = new Long(source.TsVersion);
        }
        if (source.ValidTs != null) {
            this.ValidTs = new Long(source.ValidTs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TsVersion", this.TsVersion);
        this.setParamSimple(map, prefix + "ValidTs", this.ValidTs);

    }
}

