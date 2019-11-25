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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EditBashRuleRequest  extends AbstractModel{

    /**
    * 规则名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 危险等级(1: 高危 2:中危 3: 低危)
    */
    @SerializedName("Level")
    @Expose
    private Integer Level;

    /**
    * 正则表达式
    */
    @SerializedName("Rule")
    @Expose
    private String Rule;

    /**
    * 规则ID(新增时不填)
    */
    @SerializedName("Id")
    @Expose
    private Integer Id;

    /**
    * 客户端ID(IsGlobal为1时，Uuid或Hostip必填一个)
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 主机IP(IsGlobal为1时，Uuid或Hostip必填一个)
    */
    @SerializedName("Hostip")
    @Expose
    private String Hostip;

    /**
    * 是否全局规则(默认否)
    */
    @SerializedName("IsGlobal")
    @Expose
    private Integer IsGlobal;

    /**
     * 获取规则名称
     * @return Name 规则名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置规则名称
     * @param Name 规则名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取危险等级(1: 高危 2:中危 3: 低危)
     * @return Level 危险等级(1: 高危 2:中危 3: 低危)
     */
    public Integer getLevel() {
        return this.Level;
    }

    /**
     * 设置危险等级(1: 高危 2:中危 3: 低危)
     * @param Level 危险等级(1: 高危 2:中危 3: 低危)
     */
    public void setLevel(Integer Level) {
        this.Level = Level;
    }

    /**
     * 获取正则表达式
     * @return Rule 正则表达式
     */
    public String getRule() {
        return this.Rule;
    }

    /**
     * 设置正则表达式
     * @param Rule 正则表达式
     */
    public void setRule(String Rule) {
        this.Rule = Rule;
    }

    /**
     * 获取规则ID(新增时不填)
     * @return Id 规则ID(新增时不填)
     */
    public Integer getId() {
        return this.Id;
    }

    /**
     * 设置规则ID(新增时不填)
     * @param Id 规则ID(新增时不填)
     */
    public void setId(Integer Id) {
        this.Id = Id;
    }

    /**
     * 获取客户端ID(IsGlobal为1时，Uuid或Hostip必填一个)
     * @return Uuid 客户端ID(IsGlobal为1时，Uuid或Hostip必填一个)
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * 设置客户端ID(IsGlobal为1时，Uuid或Hostip必填一个)
     * @param Uuid 客户端ID(IsGlobal为1时，Uuid或Hostip必填一个)
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * 获取主机IP(IsGlobal为1时，Uuid或Hostip必填一个)
     * @return Hostip 主机IP(IsGlobal为1时，Uuid或Hostip必填一个)
     */
    public String getHostip() {
        return this.Hostip;
    }

    /**
     * 设置主机IP(IsGlobal为1时，Uuid或Hostip必填一个)
     * @param Hostip 主机IP(IsGlobal为1时，Uuid或Hostip必填一个)
     */
    public void setHostip(String Hostip) {
        this.Hostip = Hostip;
    }

    /**
     * 获取是否全局规则(默认否)
     * @return IsGlobal 是否全局规则(默认否)
     */
    public Integer getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * 设置是否全局规则(默认否)
     * @param IsGlobal 是否全局规则(默认否)
     */
    public void setIsGlobal(Integer IsGlobal) {
        this.IsGlobal = IsGlobal;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Rule", this.Rule);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Hostip", this.Hostip);
        this.setParamSimple(map, prefix + "IsGlobal", this.IsGlobal);

    }
}

