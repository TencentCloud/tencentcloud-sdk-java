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

public class AccessKeyRisk extends AbstractModel {

    /**
    * 风险名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 风险等级
0-无效 1-提示 2-低危 3-中危 4-高危 5-严重
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 风险记录ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 风险规则ID
    */
    @SerializedName("RiskRuleID")
    @Expose
    private Long RiskRuleID;

    /**
    * 风险类型
0-配置风险
    */
    @SerializedName("RiskType")
    @Expose
    private Long RiskType;

    /**
    * 访问密钥
    */
    @SerializedName("AccessKey")
    @Expose
    private String AccessKey;

    /**
    * 访问密钥ID
    */
    @SerializedName("AccessKeyID")
    @Expose
    private Long AccessKeyID;

    /**
    * 访问密钥备注
    */
    @SerializedName("AccessKeyRemark")
    @Expose
    private String AccessKeyRemark;

    /**
    * 风险检出时间
    */
    @SerializedName("RiskTime")
    @Expose
    private String RiskTime;

    /**
    * 风险状态
0-未处理 2-已忽略 3-已收敛
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 风险标签
    */
    @SerializedName("Tag")
    @Expose
    private String [] Tag;

    /**
    * 风险证据
    */
    @SerializedName("Evidence")
    @Expose
    private String Evidence;

    /**
    * 风险描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 所属主账号Uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 所属主账号昵称
    */
    @SerializedName("Nickname")
    @Expose
    private String Nickname;

    /**
    * 所属子账号Uin
    */
    @SerializedName("SubUin")
    @Expose
    private String SubUin;

    /**
    * 所属子账号昵称
    */
    @SerializedName("SubNickname")
    @Expose
    private String SubNickname;

    /**
    * 账号类型
0 主账号AK 1子账号AK
2 临时密钥
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 检测状态
0表示 已检测
1表示 检测中
    */
    @SerializedName("CheckStatus")
    @Expose
    private Long CheckStatus;

    /**
    * 所属appid
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * 对应风险的查询参数
    */
    @SerializedName("QueryParam")
    @Expose
    private String QueryParam;

    /**
     * Get 风险名称 
     * @return Name 风险名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 风险名称
     * @param Name 风险名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 风险等级
0-无效 1-提示 2-低危 3-中危 4-高危 5-严重 
     * @return Level 风险等级
0-无效 1-提示 2-低危 3-中危 4-高危 5-严重
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 风险等级
0-无效 1-提示 2-低危 3-中危 4-高危 5-严重
     * @param Level 风险等级
0-无效 1-提示 2-低危 3-中危 4-高危 5-严重
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 风险记录ID 
     * @return ID 风险记录ID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 风险记录ID
     * @param ID 风险记录ID
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get 风险规则ID 
     * @return RiskRuleID 风险规则ID
     */
    public Long getRiskRuleID() {
        return this.RiskRuleID;
    }

    /**
     * Set 风险规则ID
     * @param RiskRuleID 风险规则ID
     */
    public void setRiskRuleID(Long RiskRuleID) {
        this.RiskRuleID = RiskRuleID;
    }

    /**
     * Get 风险类型
0-配置风险 
     * @return RiskType 风险类型
0-配置风险
     */
    public Long getRiskType() {
        return this.RiskType;
    }

    /**
     * Set 风险类型
0-配置风险
     * @param RiskType 风险类型
0-配置风险
     */
    public void setRiskType(Long RiskType) {
        this.RiskType = RiskType;
    }

    /**
     * Get 访问密钥 
     * @return AccessKey 访问密钥
     */
    public String getAccessKey() {
        return this.AccessKey;
    }

    /**
     * Set 访问密钥
     * @param AccessKey 访问密钥
     */
    public void setAccessKey(String AccessKey) {
        this.AccessKey = AccessKey;
    }

    /**
     * Get 访问密钥ID 
     * @return AccessKeyID 访问密钥ID
     */
    public Long getAccessKeyID() {
        return this.AccessKeyID;
    }

    /**
     * Set 访问密钥ID
     * @param AccessKeyID 访问密钥ID
     */
    public void setAccessKeyID(Long AccessKeyID) {
        this.AccessKeyID = AccessKeyID;
    }

    /**
     * Get 访问密钥备注 
     * @return AccessKeyRemark 访问密钥备注
     */
    public String getAccessKeyRemark() {
        return this.AccessKeyRemark;
    }

    /**
     * Set 访问密钥备注
     * @param AccessKeyRemark 访问密钥备注
     */
    public void setAccessKeyRemark(String AccessKeyRemark) {
        this.AccessKeyRemark = AccessKeyRemark;
    }

    /**
     * Get 风险检出时间 
     * @return RiskTime 风险检出时间
     */
    public String getRiskTime() {
        return this.RiskTime;
    }

    /**
     * Set 风险检出时间
     * @param RiskTime 风险检出时间
     */
    public void setRiskTime(String RiskTime) {
        this.RiskTime = RiskTime;
    }

    /**
     * Get 风险状态
0-未处理 2-已忽略 3-已收敛 
     * @return Status 风险状态
0-未处理 2-已忽略 3-已收敛
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 风险状态
0-未处理 2-已忽略 3-已收敛
     * @param Status 风险状态
0-未处理 2-已忽略 3-已收敛
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 风险标签 
     * @return Tag 风险标签
     */
    public String [] getTag() {
        return this.Tag;
    }

    /**
     * Set 风险标签
     * @param Tag 风险标签
     */
    public void setTag(String [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get 风险证据 
     * @return Evidence 风险证据
     */
    public String getEvidence() {
        return this.Evidence;
    }

    /**
     * Set 风险证据
     * @param Evidence 风险证据
     */
    public void setEvidence(String Evidence) {
        this.Evidence = Evidence;
    }

    /**
     * Get 风险描述 
     * @return Description 风险描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 风险描述
     * @param Description 风险描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 所属主账号Uin 
     * @return Uin 所属主账号Uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 所属主账号Uin
     * @param Uin 所属主账号Uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 所属主账号昵称 
     * @return Nickname 所属主账号昵称
     */
    public String getNickname() {
        return this.Nickname;
    }

    /**
     * Set 所属主账号昵称
     * @param Nickname 所属主账号昵称
     */
    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    /**
     * Get 所属子账号Uin 
     * @return SubUin 所属子账号Uin
     */
    public String getSubUin() {
        return this.SubUin;
    }

    /**
     * Set 所属子账号Uin
     * @param SubUin 所属子账号Uin
     */
    public void setSubUin(String SubUin) {
        this.SubUin = SubUin;
    }

    /**
     * Get 所属子账号昵称 
     * @return SubNickname 所属子账号昵称
     */
    public String getSubNickname() {
        return this.SubNickname;
    }

    /**
     * Set 所属子账号昵称
     * @param SubNickname 所属子账号昵称
     */
    public void setSubNickname(String SubNickname) {
        this.SubNickname = SubNickname;
    }

    /**
     * Get 账号类型
0 主账号AK 1子账号AK
2 临时密钥 
     * @return Type 账号类型
0 主账号AK 1子账号AK
2 临时密钥
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 账号类型
0 主账号AK 1子账号AK
2 临时密钥
     * @param Type 账号类型
0 主账号AK 1子账号AK
2 临时密钥
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 检测状态
0表示 已检测
1表示 检测中 
     * @return CheckStatus 检测状态
0表示 已检测
1表示 检测中
     */
    public Long getCheckStatus() {
        return this.CheckStatus;
    }

    /**
     * Set 检测状态
0表示 已检测
1表示 检测中
     * @param CheckStatus 检测状态
0表示 已检测
1表示 检测中
     */
    public void setCheckStatus(Long CheckStatus) {
        this.CheckStatus = CheckStatus;
    }

    /**
     * Get 所属appid 
     * @return AppID 所属appid
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set 所属appid
     * @param AppID 所属appid
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get 对应风险的查询参数 
     * @return QueryParam 对应风险的查询参数
     */
    public String getQueryParam() {
        return this.QueryParam;
    }

    /**
     * Set 对应风险的查询参数
     * @param QueryParam 对应风险的查询参数
     */
    public void setQueryParam(String QueryParam) {
        this.QueryParam = QueryParam;
    }

    public AccessKeyRisk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessKeyRisk(AccessKeyRisk source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.RiskRuleID != null) {
            this.RiskRuleID = new Long(source.RiskRuleID);
        }
        if (source.RiskType != null) {
            this.RiskType = new Long(source.RiskType);
        }
        if (source.AccessKey != null) {
            this.AccessKey = new String(source.AccessKey);
        }
        if (source.AccessKeyID != null) {
            this.AccessKeyID = new Long(source.AccessKeyID);
        }
        if (source.AccessKeyRemark != null) {
            this.AccessKeyRemark = new String(source.AccessKeyRemark);
        }
        if (source.RiskTime != null) {
            this.RiskTime = new String(source.RiskTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Tag != null) {
            this.Tag = new String[source.Tag.length];
            for (int i = 0; i < source.Tag.length; i++) {
                this.Tag[i] = new String(source.Tag[i]);
            }
        }
        if (source.Evidence != null) {
            this.Evidence = new String(source.Evidence);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.Nickname != null) {
            this.Nickname = new String(source.Nickname);
        }
        if (source.SubUin != null) {
            this.SubUin = new String(source.SubUin);
        }
        if (source.SubNickname != null) {
            this.SubNickname = new String(source.SubNickname);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.CheckStatus != null) {
            this.CheckStatus = new Long(source.CheckStatus);
        }
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.QueryParam != null) {
            this.QueryParam = new String(source.QueryParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "RiskRuleID", this.RiskRuleID);
        this.setParamSimple(map, prefix + "RiskType", this.RiskType);
        this.setParamSimple(map, prefix + "AccessKey", this.AccessKey);
        this.setParamSimple(map, prefix + "AccessKeyID", this.AccessKeyID);
        this.setParamSimple(map, prefix + "AccessKeyRemark", this.AccessKeyRemark);
        this.setParamSimple(map, prefix + "RiskTime", this.RiskTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "Tag.", this.Tag);
        this.setParamSimple(map, prefix + "Evidence", this.Evidence);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Nickname", this.Nickname);
        this.setParamSimple(map, prefix + "SubUin", this.SubUin);
        this.setParamSimple(map, prefix + "SubNickname", this.SubNickname);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CheckStatus", this.CheckStatus);
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "QueryParam", this.QueryParam);

    }
}

