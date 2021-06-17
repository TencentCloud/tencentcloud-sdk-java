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
package com.tencentcloudapi.iai.v20200303.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeGroupFaceModelVersionRequest extends AbstractModel{

    /**
    * 需要升级的人员库ID。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 需要升级至的算法模型版本。默认为最新版本。不可逆向升级
    */
    @SerializedName("FaceModelVersion")
    @Expose
    private String FaceModelVersion;

    /**
     * Get 需要升级的人员库ID。 
     * @return GroupId 需要升级的人员库ID。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 需要升级的人员库ID。
     * @param GroupId 需要升级的人员库ID。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 需要升级至的算法模型版本。默认为最新版本。不可逆向升级 
     * @return FaceModelVersion 需要升级至的算法模型版本。默认为最新版本。不可逆向升级
     */
    public String getFaceModelVersion() {
        return this.FaceModelVersion;
    }

    /**
     * Set 需要升级至的算法模型版本。默认为最新版本。不可逆向升级
     * @param FaceModelVersion 需要升级至的算法模型版本。默认为最新版本。不可逆向升级
     */
    public void setFaceModelVersion(String FaceModelVersion) {
        this.FaceModelVersion = FaceModelVersion;
    }

    public UpgradeGroupFaceModelVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeGroupFaceModelVersionRequest(UpgradeGroupFaceModelVersionRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.FaceModelVersion != null) {
            this.FaceModelVersion = new String(source.FaceModelVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "FaceModelVersion", this.FaceModelVersion);

    }
}

