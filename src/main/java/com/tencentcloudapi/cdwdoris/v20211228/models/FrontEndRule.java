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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FrontEndRule extends AbstractModel {

    /**
    * id序列
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 规则名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 详细规则
    */
    @SerializedName("Rule")
    @Expose
    private String Rule;

    /**
     * Get id序列 
     * @return ID id序列
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set id序列
     * @param ID id序列
     */
    public void setID(Long ID) {
        this.ID = ID;
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
     * Get 详细规则 
     * @return Rule 详细规则
     */
    public String getRule() {
        return this.Rule;
    }

    /**
     * Set 详细规则
     * @param Rule 详细规则
     */
    public void setRule(String Rule) {
        this.Rule = Rule;
    }

    public FrontEndRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FrontEndRule(FrontEndRule source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Rule != null) {
            this.Rule = new String(source.Rule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Rule", this.Rule);

    }
}

