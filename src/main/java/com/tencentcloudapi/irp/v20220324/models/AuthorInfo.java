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
package com.tencentcloudapi.irp.v20220324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuthorInfo extends AbstractModel{

    /**
    * 作者id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 作者名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 作者来源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceId")
    @Expose
    private Long SourceId;

    /**
    * 关注类型：1-关注，2-取关
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FollowType")
    @Expose
    private Long FollowType;

    /**
    * 作者头像icon地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IconUrl")
    @Expose
    private String IconUrl;

    /**
     * Get 作者id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 作者id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 作者id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 作者id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 作者名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 作者名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 作者名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 作者名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 作者来源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceId 作者来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSourceId() {
        return this.SourceId;
    }

    /**
     * Set 作者来源
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceId 作者来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceId(Long SourceId) {
        this.SourceId = SourceId;
    }

    /**
     * Get 关注类型：1-关注，2-取关
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FollowType 关注类型：1-关注，2-取关
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFollowType() {
        return this.FollowType;
    }

    /**
     * Set 关注类型：1-关注，2-取关
注意：此字段可能返回 null，表示取不到有效值。
     * @param FollowType 关注类型：1-关注，2-取关
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFollowType(Long FollowType) {
        this.FollowType = FollowType;
    }

    /**
     * Get 作者头像icon地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IconUrl 作者头像icon地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIconUrl() {
        return this.IconUrl;
    }

    /**
     * Set 作者头像icon地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param IconUrl 作者头像icon地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIconUrl(String IconUrl) {
        this.IconUrl = IconUrl;
    }

    public AuthorInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuthorInfo(AuthorInfo source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SourceId != null) {
            this.SourceId = new Long(source.SourceId);
        }
        if (source.FollowType != null) {
            this.FollowType = new Long(source.FollowType);
        }
        if (source.IconUrl != null) {
            this.IconUrl = new String(source.IconUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SourceId", this.SourceId);
        this.setParamSimple(map, prefix + "FollowType", this.FollowType);
        this.setParamSimple(map, prefix + "IconUrl", this.IconUrl);

    }
}

