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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BotManagedRule extends AbstractModel{

    /**
    * 本规则的ID。
    */
    @SerializedName("RuleID")
    @Expose
    private Long RuleID;

    /**
    * 老版本的通用规则ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ManagedIds")
    @Expose
    private Long [] ManagedIds;

    /**
    * 触发规则后的处置方式。
1. drop 拦截
2. trans 放行
3. monitor 观察
4. alg Javascript挑战
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 封禁的惩罚时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PunishTime")
    @Expose
    private Long PunishTime;

    /**
    * 封禁的惩罚时间单位。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PunishTimeUnit")
    @Expose
    private String PunishTimeUnit;

    /**
    * 放行的规则ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TransManagedIds")
    @Expose
    private Long [] TransManagedIds;

    /**
    * JS挑战的规则ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlgManagedIds")
    @Expose
    private Long [] AlgManagedIds;

    /**
    * 数字验证码的规则ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CapManagedIds")
    @Expose
    private Long [] CapManagedIds;

    /**
    * 观察的规则ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MonManagedIds")
    @Expose
    private Long [] MonManagedIds;

    /**
    * 拦截的规则ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DropManagedIds")
    @Expose
    private Long [] DropManagedIds;

    /**
    * 自定义返回页面的实例id。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PageId")
    @Expose
    private Long PageId;

    /**
    * 自定义返回页面的名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 重定向时候的地址，必须为本用户接入的站点子域名，使用URLENCODE。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RedirectUrl")
    @Expose
    private String RedirectUrl;

    /**
    * 重定向时候的返回码。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResponseCode")
    @Expose
    private Long ResponseCode;

    /**
     * Get 本规则的ID。 
     * @return RuleID 本规则的ID。
     */
    public Long getRuleID() {
        return this.RuleID;
    }

    /**
     * Set 本规则的ID。
     * @param RuleID 本规则的ID。
     */
    public void setRuleID(Long RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get 老版本的通用规则ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ManagedIds 老版本的通用规则ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getManagedIds() {
        return this.ManagedIds;
    }

    /**
     * Set 老版本的通用规则ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ManagedIds 老版本的通用规则ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setManagedIds(Long [] ManagedIds) {
        this.ManagedIds = ManagedIds;
    }

    /**
     * Get 触发规则后的处置方式。
1. drop 拦截
2. trans 放行
3. monitor 观察
4. alg Javascript挑战 
     * @return Action 触发规则后的处置方式。
1. drop 拦截
2. trans 放行
3. monitor 观察
4. alg Javascript挑战
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 触发规则后的处置方式。
1. drop 拦截
2. trans 放行
3. monitor 观察
4. alg Javascript挑战
     * @param Action 触发规则后的处置方式。
1. drop 拦截
2. trans 放行
3. monitor 观察
4. alg Javascript挑战
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 封禁的惩罚时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PunishTime 封禁的惩罚时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPunishTime() {
        return this.PunishTime;
    }

    /**
     * Set 封禁的惩罚时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PunishTime 封禁的惩罚时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPunishTime(Long PunishTime) {
        this.PunishTime = PunishTime;
    }

    /**
     * Get 封禁的惩罚时间单位。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PunishTimeUnit 封禁的惩罚时间单位。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPunishTimeUnit() {
        return this.PunishTimeUnit;
    }

    /**
     * Set 封禁的惩罚时间单位。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PunishTimeUnit 封禁的惩罚时间单位。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPunishTimeUnit(String PunishTimeUnit) {
        this.PunishTimeUnit = PunishTimeUnit;
    }

    /**
     * Get 放行的规则ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TransManagedIds 放行的规则ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getTransManagedIds() {
        return this.TransManagedIds;
    }

    /**
     * Set 放行的规则ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TransManagedIds 放行的规则ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTransManagedIds(Long [] TransManagedIds) {
        this.TransManagedIds = TransManagedIds;
    }

    /**
     * Get JS挑战的规则ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlgManagedIds JS挑战的规则ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getAlgManagedIds() {
        return this.AlgManagedIds;
    }

    /**
     * Set JS挑战的规则ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlgManagedIds JS挑战的规则ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlgManagedIds(Long [] AlgManagedIds) {
        this.AlgManagedIds = AlgManagedIds;
    }

    /**
     * Get 数字验证码的规则ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CapManagedIds 数字验证码的规则ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getCapManagedIds() {
        return this.CapManagedIds;
    }

    /**
     * Set 数字验证码的规则ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CapManagedIds 数字验证码的规则ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCapManagedIds(Long [] CapManagedIds) {
        this.CapManagedIds = CapManagedIds;
    }

    /**
     * Get 观察的规则ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MonManagedIds 观察的规则ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getMonManagedIds() {
        return this.MonManagedIds;
    }

    /**
     * Set 观察的规则ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MonManagedIds 观察的规则ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMonManagedIds(Long [] MonManagedIds) {
        this.MonManagedIds = MonManagedIds;
    }

    /**
     * Get 拦截的规则ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DropManagedIds 拦截的规则ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getDropManagedIds() {
        return this.DropManagedIds;
    }

    /**
     * Set 拦截的规则ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DropManagedIds 拦截的规则ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDropManagedIds(Long [] DropManagedIds) {
        this.DropManagedIds = DropManagedIds;
    }

    /**
     * Get 自定义返回页面的实例id。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PageId 自定义返回页面的实例id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPageId() {
        return this.PageId;
    }

    /**
     * Set 自定义返回页面的实例id。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PageId 自定义返回页面的实例id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPageId(Long PageId) {
        this.PageId = PageId;
    }

    /**
     * Get 自定义返回页面的名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 自定义返回页面的名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 自定义返回页面的名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 自定义返回页面的名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 重定向时候的地址，必须为本用户接入的站点子域名，使用URLENCODE。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RedirectUrl 重定向时候的地址，必须为本用户接入的站点子域名，使用URLENCODE。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRedirectUrl() {
        return this.RedirectUrl;
    }

    /**
     * Set 重定向时候的地址，必须为本用户接入的站点子域名，使用URLENCODE。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RedirectUrl 重定向时候的地址，必须为本用户接入的站点子域名，使用URLENCODE。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRedirectUrl(String RedirectUrl) {
        this.RedirectUrl = RedirectUrl;
    }

    /**
     * Get 重定向时候的返回码。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResponseCode 重定向时候的返回码。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getResponseCode() {
        return this.ResponseCode;
    }

    /**
     * Set 重定向时候的返回码。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResponseCode 重定向时候的返回码。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResponseCode(Long ResponseCode) {
        this.ResponseCode = ResponseCode;
    }

    public BotManagedRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotManagedRule(BotManagedRule source) {
        if (source.RuleID != null) {
            this.RuleID = new Long(source.RuleID);
        }
        if (source.ManagedIds != null) {
            this.ManagedIds = new Long[source.ManagedIds.length];
            for (int i = 0; i < source.ManagedIds.length; i++) {
                this.ManagedIds[i] = new Long(source.ManagedIds[i]);
            }
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.PunishTime != null) {
            this.PunishTime = new Long(source.PunishTime);
        }
        if (source.PunishTimeUnit != null) {
            this.PunishTimeUnit = new String(source.PunishTimeUnit);
        }
        if (source.TransManagedIds != null) {
            this.TransManagedIds = new Long[source.TransManagedIds.length];
            for (int i = 0; i < source.TransManagedIds.length; i++) {
                this.TransManagedIds[i] = new Long(source.TransManagedIds[i]);
            }
        }
        if (source.AlgManagedIds != null) {
            this.AlgManagedIds = new Long[source.AlgManagedIds.length];
            for (int i = 0; i < source.AlgManagedIds.length; i++) {
                this.AlgManagedIds[i] = new Long(source.AlgManagedIds[i]);
            }
        }
        if (source.CapManagedIds != null) {
            this.CapManagedIds = new Long[source.CapManagedIds.length];
            for (int i = 0; i < source.CapManagedIds.length; i++) {
                this.CapManagedIds[i] = new Long(source.CapManagedIds[i]);
            }
        }
        if (source.MonManagedIds != null) {
            this.MonManagedIds = new Long[source.MonManagedIds.length];
            for (int i = 0; i < source.MonManagedIds.length; i++) {
                this.MonManagedIds[i] = new Long(source.MonManagedIds[i]);
            }
        }
        if (source.DropManagedIds != null) {
            this.DropManagedIds = new Long[source.DropManagedIds.length];
            for (int i = 0; i < source.DropManagedIds.length; i++) {
                this.DropManagedIds[i] = new Long(source.DropManagedIds[i]);
            }
        }
        if (source.PageId != null) {
            this.PageId = new Long(source.PageId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.RedirectUrl != null) {
            this.RedirectUrl = new String(source.RedirectUrl);
        }
        if (source.ResponseCode != null) {
            this.ResponseCode = new Long(source.ResponseCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamArraySimple(map, prefix + "ManagedIds.", this.ManagedIds);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "PunishTime", this.PunishTime);
        this.setParamSimple(map, prefix + "PunishTimeUnit", this.PunishTimeUnit);
        this.setParamArraySimple(map, prefix + "TransManagedIds.", this.TransManagedIds);
        this.setParamArraySimple(map, prefix + "AlgManagedIds.", this.AlgManagedIds);
        this.setParamArraySimple(map, prefix + "CapManagedIds.", this.CapManagedIds);
        this.setParamArraySimple(map, prefix + "MonManagedIds.", this.MonManagedIds);
        this.setParamArraySimple(map, prefix + "DropManagedIds.", this.DropManagedIds);
        this.setParamSimple(map, prefix + "PageId", this.PageId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "RedirectUrl", this.RedirectUrl);
        this.setParamSimple(map, prefix + "ResponseCode", this.ResponseCode);

    }
}

