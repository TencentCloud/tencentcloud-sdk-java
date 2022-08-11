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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyStaffRequest extends AbstractModel{

    /**
    * 应用ID
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 坐席账户
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * 坐席名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 坐席手机号（带0086前缀,示例：008618011111111）
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * 坐席昵称
    */
    @SerializedName("Nick")
    @Expose
    private String Nick;

    /**
    * 绑定技能组ID列表
    */
    @SerializedName("SkillGroupIds")
    @Expose
    private Long [] SkillGroupIds;

    /**
    * 是否开启手机外呼开关
    */
    @SerializedName("UseMobileCallOut")
    @Expose
    private Boolean UseMobileCallOut;

    /**
    * 手机接听模式 0 - 关闭 | 1 - 仅离线 | 2 - 始终
    */
    @SerializedName("UseMobileAccept")
    @Expose
    private Long UseMobileAccept;

    /**
     * Get 应用ID 
     * @return SdkAppId 应用ID
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 应用ID
     * @param SdkAppId 应用ID
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 坐席账户 
     * @return Email 坐席账户
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 坐席账户
     * @param Email 坐席账户
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get 坐席名称 
     * @return Name 坐席名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 坐席名称
     * @param Name 坐席名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 坐席手机号（带0086前缀,示例：008618011111111） 
     * @return Phone 坐席手机号（带0086前缀,示例：008618011111111）
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set 坐席手机号（带0086前缀,示例：008618011111111）
     * @param Phone 坐席手机号（带0086前缀,示例：008618011111111）
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get 坐席昵称 
     * @return Nick 坐席昵称
     */
    public String getNick() {
        return this.Nick;
    }

    /**
     * Set 坐席昵称
     * @param Nick 坐席昵称
     */
    public void setNick(String Nick) {
        this.Nick = Nick;
    }

    /**
     * Get 绑定技能组ID列表 
     * @return SkillGroupIds 绑定技能组ID列表
     */
    public Long [] getSkillGroupIds() {
        return this.SkillGroupIds;
    }

    /**
     * Set 绑定技能组ID列表
     * @param SkillGroupIds 绑定技能组ID列表
     */
    public void setSkillGroupIds(Long [] SkillGroupIds) {
        this.SkillGroupIds = SkillGroupIds;
    }

    /**
     * Get 是否开启手机外呼开关 
     * @return UseMobileCallOut 是否开启手机外呼开关
     */
    public Boolean getUseMobileCallOut() {
        return this.UseMobileCallOut;
    }

    /**
     * Set 是否开启手机外呼开关
     * @param UseMobileCallOut 是否开启手机外呼开关
     */
    public void setUseMobileCallOut(Boolean UseMobileCallOut) {
        this.UseMobileCallOut = UseMobileCallOut;
    }

    /**
     * Get 手机接听模式 0 - 关闭 | 1 - 仅离线 | 2 - 始终 
     * @return UseMobileAccept 手机接听模式 0 - 关闭 | 1 - 仅离线 | 2 - 始终
     */
    public Long getUseMobileAccept() {
        return this.UseMobileAccept;
    }

    /**
     * Set 手机接听模式 0 - 关闭 | 1 - 仅离线 | 2 - 始终
     * @param UseMobileAccept 手机接听模式 0 - 关闭 | 1 - 仅离线 | 2 - 始终
     */
    public void setUseMobileAccept(Long UseMobileAccept) {
        this.UseMobileAccept = UseMobileAccept;
    }

    public ModifyStaffRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyStaffRequest(ModifyStaffRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.Nick != null) {
            this.Nick = new String(source.Nick);
        }
        if (source.SkillGroupIds != null) {
            this.SkillGroupIds = new Long[source.SkillGroupIds.length];
            for (int i = 0; i < source.SkillGroupIds.length; i++) {
                this.SkillGroupIds[i] = new Long(source.SkillGroupIds[i]);
            }
        }
        if (source.UseMobileCallOut != null) {
            this.UseMobileCallOut = new Boolean(source.UseMobileCallOut);
        }
        if (source.UseMobileAccept != null) {
            this.UseMobileAccept = new Long(source.UseMobileAccept);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "Nick", this.Nick);
        this.setParamArraySimple(map, prefix + "SkillGroupIds.", this.SkillGroupIds);
        this.setParamSimple(map, prefix + "UseMobileCallOut", this.UseMobileCallOut);
        this.setParamSimple(map, prefix + "UseMobileAccept", this.UseMobileAccept);

    }
}

