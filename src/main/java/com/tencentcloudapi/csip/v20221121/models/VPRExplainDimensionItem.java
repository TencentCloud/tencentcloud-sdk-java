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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VPRExplainDimensionItem extends AbstractModel {

    /**
    * <p>标签</p>
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * <p>标签名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>标签描述</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>危害等级</p><p>枚举值：</p><ul><li>LOW： 低危</li><li>MEDIUM： 中危</li><li>HIGH： 高危</li><li>CRITICAL： 严重</li></ul>
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
     * Get <p>标签</p> 
     * @return Key <p>标签</p>
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set <p>标签</p>
     * @param Key <p>标签</p>
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get <p>标签名称</p> 
     * @return Name <p>标签名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>标签名称</p>
     * @param Name <p>标签名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>标签描述</p> 
     * @return Remark <p>标签描述</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>标签描述</p>
     * @param Remark <p>标签描述</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>危害等级</p><p>枚举值：</p><ul><li>LOW： 低危</li><li>MEDIUM： 中危</li><li>HIGH： 高危</li><li>CRITICAL： 严重</li></ul> 
     * @return Level <p>危害等级</p><p>枚举值：</p><ul><li>LOW： 低危</li><li>MEDIUM： 中危</li><li>HIGH： 高危</li><li>CRITICAL： 严重</li></ul>
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set <p>危害等级</p><p>枚举值：</p><ul><li>LOW： 低危</li><li>MEDIUM： 中危</li><li>HIGH： 高危</li><li>CRITICAL： 严重</li></ul>
     * @param Level <p>危害等级</p><p>枚举值：</p><ul><li>LOW： 低危</li><li>MEDIUM： 中危</li><li>HIGH： 高危</li><li>CRITICAL： 严重</li></ul>
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    public VPRExplainDimensionItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VPRExplainDimensionItem(VPRExplainDimensionItem source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Level", this.Level);

    }
}

