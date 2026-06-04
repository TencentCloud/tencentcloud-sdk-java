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

public class AppShareURLInfo extends AbstractModel {

    /**
    * 当前生效的访问控制配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccessControl")
    @Expose
    private AppShareAccessControl AccessControl;

    /**
    * 分享URL
    */
    @SerializedName("ShareUrl")
    @Expose
    private String ShareUrl;

    /**
     * Get 当前生效的访问控制配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccessControl 当前生效的访问控制配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AppShareAccessControl getAccessControl() {
        return this.AccessControl;
    }

    /**
     * Set 当前生效的访问控制配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccessControl 当前生效的访问控制配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccessControl(AppShareAccessControl AccessControl) {
        this.AccessControl = AccessControl;
    }

    /**
     * Get 分享URL 
     * @return ShareUrl 分享URL
     */
    public String getShareUrl() {
        return this.ShareUrl;
    }

    /**
     * Set 分享URL
     * @param ShareUrl 分享URL
     */
    public void setShareUrl(String ShareUrl) {
        this.ShareUrl = ShareUrl;
    }

    public AppShareURLInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppShareURLInfo(AppShareURLInfo source) {
        if (source.AccessControl != null) {
            this.AccessControl = new AppShareAccessControl(source.AccessControl);
        }
        if (source.ShareUrl != null) {
            this.ShareUrl = new String(source.ShareUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "AccessControl.", this.AccessControl);
        this.setParamSimple(map, prefix + "ShareUrl", this.ShareUrl);

    }
}

