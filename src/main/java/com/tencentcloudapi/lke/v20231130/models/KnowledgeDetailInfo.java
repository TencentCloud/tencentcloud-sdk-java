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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KnowledgeDetailInfo extends AbstractModel {

    /**
    * 知识库信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Knowledge")
    @Expose
    private KnowledgeBaseInfo Knowledge;

    /**
    * 应用列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppList")
    @Expose
    private AppBaseInfo [] AppList;

    /**
    * 用户信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("User")
    @Expose
    private UserBaseInfo User;

    /**
     * Get 知识库信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Knowledge 知识库信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KnowledgeBaseInfo getKnowledge() {
        return this.Knowledge;
    }

    /**
     * Set 知识库信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Knowledge 知识库信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKnowledge(KnowledgeBaseInfo Knowledge) {
        this.Knowledge = Knowledge;
    }

    /**
     * Get 应用列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppList 应用列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AppBaseInfo [] getAppList() {
        return this.AppList;
    }

    /**
     * Set 应用列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppList 应用列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppList(AppBaseInfo [] AppList) {
        this.AppList = AppList;
    }

    /**
     * Get 用户信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return User 用户信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UserBaseInfo getUser() {
        return this.User;
    }

    /**
     * Set 用户信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param User 用户信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUser(UserBaseInfo User) {
        this.User = User;
    }

    public KnowledgeDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KnowledgeDetailInfo(KnowledgeDetailInfo source) {
        if (source.Knowledge != null) {
            this.Knowledge = new KnowledgeBaseInfo(source.Knowledge);
        }
        if (source.AppList != null) {
            this.AppList = new AppBaseInfo[source.AppList.length];
            for (int i = 0; i < source.AppList.length; i++) {
                this.AppList[i] = new AppBaseInfo(source.AppList[i]);
            }
        }
        if (source.User != null) {
            this.User = new UserBaseInfo(source.User);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Knowledge.", this.Knowledge);
        this.setParamArrayObj(map, prefix + "AppList.", this.AppList);
        this.setParamObj(map, prefix + "User.", this.User);

    }
}

