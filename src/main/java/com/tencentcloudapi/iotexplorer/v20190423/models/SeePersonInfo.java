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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SeePersonInfo extends AbstractModel {

    /**
    * 代表人脸列表
    */
    @SerializedName("Faces")
    @Expose
    private SeeFaceInfo [] Faces;

    /**
    * 是否已标记为持久记忆
    */
    @SerializedName("IsRemembered")
    @Expose
    private Boolean IsRemembered;

    /**
    * 人员名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 人员 ID
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
    * 创建来源。0：自动识别；1：用户创建
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
     * Get 代表人脸列表 
     * @return Faces 代表人脸列表
     */
    public SeeFaceInfo [] getFaces() {
        return this.Faces;
    }

    /**
     * Set 代表人脸列表
     * @param Faces 代表人脸列表
     */
    public void setFaces(SeeFaceInfo [] Faces) {
        this.Faces = Faces;
    }

    /**
     * Get 是否已标记为持久记忆 
     * @return IsRemembered 是否已标记为持久记忆
     */
    public Boolean getIsRemembered() {
        return this.IsRemembered;
    }

    /**
     * Set 是否已标记为持久记忆
     * @param IsRemembered 是否已标记为持久记忆
     */
    public void setIsRemembered(Boolean IsRemembered) {
        this.IsRemembered = IsRemembered;
    }

    /**
     * Get 人员名称 
     * @return Name 人员名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 人员名称
     * @param Name 人员名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 人员 ID 
     * @return PersonId 人员 ID
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set 人员 ID
     * @param PersonId 人员 ID
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * Get 创建来源。0：自动识别；1：用户创建 
     * @return Source 创建来源。0：自动识别；1：用户创建
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set 创建来源。0：自动识别；1：用户创建
     * @param Source 创建来源。0：自动识别；1：用户创建
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    public SeePersonInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SeePersonInfo(SeePersonInfo source) {
        if (source.Faces != null) {
            this.Faces = new SeeFaceInfo[source.Faces.length];
            for (int i = 0; i < source.Faces.length; i++) {
                this.Faces[i] = new SeeFaceInfo(source.Faces[i]);
            }
        }
        if (source.IsRemembered != null) {
            this.IsRemembered = new Boolean(source.IsRemembered);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.PersonId != null) {
            this.PersonId = new String(source.PersonId);
        }
        if (source.Source != null) {
            this.Source = new Long(source.Source);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Faces.", this.Faces);
        this.setParamSimple(map, prefix + "IsRemembered", this.IsRemembered);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamSimple(map, prefix + "Source", this.Source);

    }
}

