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

public class ModifyLoginWhiteLearnEDRRequest extends AbstractModel {

    /**
    * <p>规则ID；自学习为规则组ID（组内最小行ID）</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>常用登录地列表，必填，1-200 个；为自学习规则唯一的内容维度</p>
    */
    @SerializedName("Places")
    @Expose
    private LoginWhitePlaceInput [] Places;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>规则所属账号 AppId（取列表出参 AppId）；为空取当前账号；非当前账号需通过归属校验</p>
    */
    @SerializedName("RuleAppId")
    @Expose
    private Long RuleAppId;

    /**
    * <p>备注，最长 255 字符</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>生效资产范围：0-指定主机（主机或标签命中） 1-全部主机</p>
    */
    @SerializedName("Scope")
    @Expose
    private Long Scope;

    /**
    * <p>指定主机（实例ID 形态）列表，最多 10000 项；服务端经 idmap 翻译为 QUUID 后与 QUUIDSWithAppId 合并去重</p>
    */
    @SerializedName("InstanceIDsWithAppId")
    @Expose
    private InstanceIDWithAppIdItem [] InstanceIDsWithAppId;

    /**
    * <p>剔除主机（实例ID 形态）列表，最多 10000 项</p>
    */
    @SerializedName("ExcludeInstanceIDsWithAppId")
    @Expose
    private InstanceIDWithAppIdItem [] ExcludeInstanceIDsWithAppId;

    /**
    * <p>安全中心标签ID列表，最多 100 个；Scope=0 时与主机为或关系；自学习白名单不支持按标签生效（传非空将被拒绝）</p>
    */
    @SerializedName("TagIDs")
    @Expose
    private String [] TagIDs;

    /**
     * Get <p>规则ID；自学习为规则组ID（组内最小行ID）</p> 
     * @return Id <p>规则ID；自学习为规则组ID（组内最小行ID）</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>规则ID；自学习为规则组ID（组内最小行ID）</p>
     * @param Id <p>规则ID；自学习为规则组ID（组内最小行ID）</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>常用登录地列表，必填，1-200 个；为自学习规则唯一的内容维度</p> 
     * @return Places <p>常用登录地列表，必填，1-200 个；为自学习规则唯一的内容维度</p>
     */
    public LoginWhitePlaceInput [] getPlaces() {
        return this.Places;
    }

    /**
     * Set <p>常用登录地列表，必填，1-200 个；为自学习规则唯一的内容维度</p>
     * @param Places <p>常用登录地列表，必填，1-200 个；为自学习规则唯一的内容维度</p>
     */
    public void setPlaces(LoginWhitePlaceInput [] Places) {
        this.Places = Places;
    }

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>规则所属账号 AppId（取列表出参 AppId）；为空取当前账号；非当前账号需通过归属校验</p> 
     * @return RuleAppId <p>规则所属账号 AppId（取列表出参 AppId）；为空取当前账号；非当前账号需通过归属校验</p>
     */
    public Long getRuleAppId() {
        return this.RuleAppId;
    }

    /**
     * Set <p>规则所属账号 AppId（取列表出参 AppId）；为空取当前账号；非当前账号需通过归属校验</p>
     * @param RuleAppId <p>规则所属账号 AppId（取列表出参 AppId）；为空取当前账号；非当前账号需通过归属校验</p>
     */
    public void setRuleAppId(Long RuleAppId) {
        this.RuleAppId = RuleAppId;
    }

    /**
     * Get <p>备注，最长 255 字符</p> 
     * @return Remark <p>备注，最长 255 字符</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注，最长 255 字符</p>
     * @param Remark <p>备注，最长 255 字符</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>生效资产范围：0-指定主机（主机或标签命中） 1-全部主机</p> 
     * @return Scope <p>生效资产范围：0-指定主机（主机或标签命中） 1-全部主机</p>
     */
    public Long getScope() {
        return this.Scope;
    }

    /**
     * Set <p>生效资产范围：0-指定主机（主机或标签命中） 1-全部主机</p>
     * @param Scope <p>生效资产范围：0-指定主机（主机或标签命中） 1-全部主机</p>
     */
    public void setScope(Long Scope) {
        this.Scope = Scope;
    }

    /**
     * Get <p>指定主机（实例ID 形态）列表，最多 10000 项；服务端经 idmap 翻译为 QUUID 后与 QUUIDSWithAppId 合并去重</p> 
     * @return InstanceIDsWithAppId <p>指定主机（实例ID 形态）列表，最多 10000 项；服务端经 idmap 翻译为 QUUID 后与 QUUIDSWithAppId 合并去重</p>
     */
    public InstanceIDWithAppIdItem [] getInstanceIDsWithAppId() {
        return this.InstanceIDsWithAppId;
    }

    /**
     * Set <p>指定主机（实例ID 形态）列表，最多 10000 项；服务端经 idmap 翻译为 QUUID 后与 QUUIDSWithAppId 合并去重</p>
     * @param InstanceIDsWithAppId <p>指定主机（实例ID 形态）列表，最多 10000 项；服务端经 idmap 翻译为 QUUID 后与 QUUIDSWithAppId 合并去重</p>
     */
    public void setInstanceIDsWithAppId(InstanceIDWithAppIdItem [] InstanceIDsWithAppId) {
        this.InstanceIDsWithAppId = InstanceIDsWithAppId;
    }

    /**
     * Get <p>剔除主机（实例ID 形态）列表，最多 10000 项</p> 
     * @return ExcludeInstanceIDsWithAppId <p>剔除主机（实例ID 形态）列表，最多 10000 项</p>
     */
    public InstanceIDWithAppIdItem [] getExcludeInstanceIDsWithAppId() {
        return this.ExcludeInstanceIDsWithAppId;
    }

    /**
     * Set <p>剔除主机（实例ID 形态）列表，最多 10000 项</p>
     * @param ExcludeInstanceIDsWithAppId <p>剔除主机（实例ID 形态）列表，最多 10000 项</p>
     */
    public void setExcludeInstanceIDsWithAppId(InstanceIDWithAppIdItem [] ExcludeInstanceIDsWithAppId) {
        this.ExcludeInstanceIDsWithAppId = ExcludeInstanceIDsWithAppId;
    }

    /**
     * Get <p>安全中心标签ID列表，最多 100 个；Scope=0 时与主机为或关系；自学习白名单不支持按标签生效（传非空将被拒绝）</p> 
     * @return TagIDs <p>安全中心标签ID列表，最多 100 个；Scope=0 时与主机为或关系；自学习白名单不支持按标签生效（传非空将被拒绝）</p>
     */
    public String [] getTagIDs() {
        return this.TagIDs;
    }

    /**
     * Set <p>安全中心标签ID列表，最多 100 个；Scope=0 时与主机为或关系；自学习白名单不支持按标签生效（传非空将被拒绝）</p>
     * @param TagIDs <p>安全中心标签ID列表，最多 100 个；Scope=0 时与主机为或关系；自学习白名单不支持按标签生效（传非空将被拒绝）</p>
     */
    public void setTagIDs(String [] TagIDs) {
        this.TagIDs = TagIDs;
    }

    public ModifyLoginWhiteLearnEDRRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLoginWhiteLearnEDRRequest(ModifyLoginWhiteLearnEDRRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Places != null) {
            this.Places = new LoginWhitePlaceInput[source.Places.length];
            for (int i = 0; i < source.Places.length; i++) {
                this.Places[i] = new LoginWhitePlaceInput(source.Places[i]);
            }
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.RuleAppId != null) {
            this.RuleAppId = new Long(source.RuleAppId);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Scope != null) {
            this.Scope = new Long(source.Scope);
        }
        if (source.InstanceIDsWithAppId != null) {
            this.InstanceIDsWithAppId = new InstanceIDWithAppIdItem[source.InstanceIDsWithAppId.length];
            for (int i = 0; i < source.InstanceIDsWithAppId.length; i++) {
                this.InstanceIDsWithAppId[i] = new InstanceIDWithAppIdItem(source.InstanceIDsWithAppId[i]);
            }
        }
        if (source.ExcludeInstanceIDsWithAppId != null) {
            this.ExcludeInstanceIDsWithAppId = new InstanceIDWithAppIdItem[source.ExcludeInstanceIDsWithAppId.length];
            for (int i = 0; i < source.ExcludeInstanceIDsWithAppId.length; i++) {
                this.ExcludeInstanceIDsWithAppId[i] = new InstanceIDWithAppIdItem(source.ExcludeInstanceIDsWithAppId[i]);
            }
        }
        if (source.TagIDs != null) {
            this.TagIDs = new String[source.TagIDs.length];
            for (int i = 0; i < source.TagIDs.length; i++) {
                this.TagIDs[i] = new String(source.TagIDs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArrayObj(map, prefix + "Places.", this.Places);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "RuleAppId", this.RuleAppId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamArrayObj(map, prefix + "InstanceIDsWithAppId.", this.InstanceIDsWithAppId);
        this.setParamArrayObj(map, prefix + "ExcludeInstanceIDsWithAppId.", this.ExcludeInstanceIDsWithAppId);
        this.setParamArraySimple(map, prefix + "TagIDs.", this.TagIDs);

    }
}

