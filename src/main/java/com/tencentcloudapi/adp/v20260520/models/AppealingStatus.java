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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppealingStatus extends AbstractModel {

    /**
    * 头像是否在申诉中
    */
    @SerializedName("AvatarInAppeal")
    @Expose
    private Boolean AvatarInAppeal;

    /**
    * 兜底回复语是否在申诉中
    */
    @SerializedName("FallbackReplyInAppeal")
    @Expose
    private Boolean FallbackReplyInAppeal;

    /**
    * 欢迎语是否在申诉中
    */
    @SerializedName("GreetingInAppeal")
    @Expose
    private Boolean GreetingInAppeal;

    /**
    * 应用名称是否在申诉中
    */
    @SerializedName("NameInAppeal")
    @Expose
    private Boolean NameInAppeal;

    /**
    * 角色描述是否在申诉中
    */
    @SerializedName("RoleInAppeal")
    @Expose
    private Boolean RoleInAppeal;

    /**
     * Get 头像是否在申诉中 
     * @return AvatarInAppeal 头像是否在申诉中
     */
    public Boolean getAvatarInAppeal() {
        return this.AvatarInAppeal;
    }

    /**
     * Set 头像是否在申诉中
     * @param AvatarInAppeal 头像是否在申诉中
     */
    public void setAvatarInAppeal(Boolean AvatarInAppeal) {
        this.AvatarInAppeal = AvatarInAppeal;
    }

    /**
     * Get 兜底回复语是否在申诉中 
     * @return FallbackReplyInAppeal 兜底回复语是否在申诉中
     */
    public Boolean getFallbackReplyInAppeal() {
        return this.FallbackReplyInAppeal;
    }

    /**
     * Set 兜底回复语是否在申诉中
     * @param FallbackReplyInAppeal 兜底回复语是否在申诉中
     */
    public void setFallbackReplyInAppeal(Boolean FallbackReplyInAppeal) {
        this.FallbackReplyInAppeal = FallbackReplyInAppeal;
    }

    /**
     * Get 欢迎语是否在申诉中 
     * @return GreetingInAppeal 欢迎语是否在申诉中
     */
    public Boolean getGreetingInAppeal() {
        return this.GreetingInAppeal;
    }

    /**
     * Set 欢迎语是否在申诉中
     * @param GreetingInAppeal 欢迎语是否在申诉中
     */
    public void setGreetingInAppeal(Boolean GreetingInAppeal) {
        this.GreetingInAppeal = GreetingInAppeal;
    }

    /**
     * Get 应用名称是否在申诉中 
     * @return NameInAppeal 应用名称是否在申诉中
     */
    public Boolean getNameInAppeal() {
        return this.NameInAppeal;
    }

    /**
     * Set 应用名称是否在申诉中
     * @param NameInAppeal 应用名称是否在申诉中
     */
    public void setNameInAppeal(Boolean NameInAppeal) {
        this.NameInAppeal = NameInAppeal;
    }

    /**
     * Get 角色描述是否在申诉中 
     * @return RoleInAppeal 角色描述是否在申诉中
     */
    public Boolean getRoleInAppeal() {
        return this.RoleInAppeal;
    }

    /**
     * Set 角色描述是否在申诉中
     * @param RoleInAppeal 角色描述是否在申诉中
     */
    public void setRoleInAppeal(Boolean RoleInAppeal) {
        this.RoleInAppeal = RoleInAppeal;
    }

    public AppealingStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppealingStatus(AppealingStatus source) {
        if (source.AvatarInAppeal != null) {
            this.AvatarInAppeal = new Boolean(source.AvatarInAppeal);
        }
        if (source.FallbackReplyInAppeal != null) {
            this.FallbackReplyInAppeal = new Boolean(source.FallbackReplyInAppeal);
        }
        if (source.GreetingInAppeal != null) {
            this.GreetingInAppeal = new Boolean(source.GreetingInAppeal);
        }
        if (source.NameInAppeal != null) {
            this.NameInAppeal = new Boolean(source.NameInAppeal);
        }
        if (source.RoleInAppeal != null) {
            this.RoleInAppeal = new Boolean(source.RoleInAppeal);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AvatarInAppeal", this.AvatarInAppeal);
        this.setParamSimple(map, prefix + "FallbackReplyInAppeal", this.FallbackReplyInAppeal);
        this.setParamSimple(map, prefix + "GreetingInAppeal", this.GreetingInAppeal);
        this.setParamSimple(map, prefix + "NameInAppeal", this.NameInAppeal);
        this.setParamSimple(map, prefix + "RoleInAppeal", this.RoleInAppeal);

    }
}

