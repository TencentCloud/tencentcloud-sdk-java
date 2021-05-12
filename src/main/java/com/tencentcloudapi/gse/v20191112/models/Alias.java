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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Alias extends AbstractModel{

    /**
    * 别名的唯一标识符
    */
    @SerializedName("AliasId")
    @Expose
    private String AliasId;

    /**
    * 别名的全局唯一资源标识符
    */
    @SerializedName("AliasArn")
    @Expose
    private String AliasArn;

    /**
    * 名字，长度不小于1字符不超过1024字符
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 别名的可读说明，长度不小于1字符不超过1024字符
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 别名的路由配置
    */
    @SerializedName("RoutingStrategy")
    @Expose
    private RoutingStrategy RoutingStrategy;

    /**
    * 创建时间
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * 上次修改此数据对象的时间
    */
    @SerializedName("LastUpdatedTime")
    @Expose
    private String LastUpdatedTime;

    /**
    * 标签列表，最大长度50组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get 别名的唯一标识符 
     * @return AliasId 别名的唯一标识符
     */
    public String getAliasId() {
        return this.AliasId;
    }

    /**
     * Set 别名的唯一标识符
     * @param AliasId 别名的唯一标识符
     */
    public void setAliasId(String AliasId) {
        this.AliasId = AliasId;
    }

    /**
     * Get 别名的全局唯一资源标识符 
     * @return AliasArn 别名的全局唯一资源标识符
     */
    public String getAliasArn() {
        return this.AliasArn;
    }

    /**
     * Set 别名的全局唯一资源标识符
     * @param AliasArn 别名的全局唯一资源标识符
     */
    public void setAliasArn(String AliasArn) {
        this.AliasArn = AliasArn;
    }

    /**
     * Get 名字，长度不小于1字符不超过1024字符 
     * @return Name 名字，长度不小于1字符不超过1024字符
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名字，长度不小于1字符不超过1024字符
     * @param Name 名字，长度不小于1字符不超过1024字符
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 别名的可读说明，长度不小于1字符不超过1024字符
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 别名的可读说明，长度不小于1字符不超过1024字符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 别名的可读说明，长度不小于1字符不超过1024字符
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 别名的可读说明，长度不小于1字符不超过1024字符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 别名的路由配置 
     * @return RoutingStrategy 别名的路由配置
     */
    public RoutingStrategy getRoutingStrategy() {
        return this.RoutingStrategy;
    }

    /**
     * Set 别名的路由配置
     * @param RoutingStrategy 别名的路由配置
     */
    public void setRoutingStrategy(RoutingStrategy RoutingStrategy) {
        this.RoutingStrategy = RoutingStrategy;
    }

    /**
     * Get 创建时间 
     * @return CreationTime 创建时间
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set 创建时间
     * @param CreationTime 创建时间
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get 上次修改此数据对象的时间 
     * @return LastUpdatedTime 上次修改此数据对象的时间
     */
    public String getLastUpdatedTime() {
        return this.LastUpdatedTime;
    }

    /**
     * Set 上次修改此数据对象的时间
     * @param LastUpdatedTime 上次修改此数据对象的时间
     */
    public void setLastUpdatedTime(String LastUpdatedTime) {
        this.LastUpdatedTime = LastUpdatedTime;
    }

    /**
     * Get 标签列表，最大长度50组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 标签列表，最大长度50组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签列表，最大长度50组
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 标签列表，最大长度50组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public Alias() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Alias(Alias source) {
        if (source.AliasId != null) {
            this.AliasId = new String(source.AliasId);
        }
        if (source.AliasArn != null) {
            this.AliasArn = new String(source.AliasArn);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RoutingStrategy != null) {
            this.RoutingStrategy = new RoutingStrategy(source.RoutingStrategy);
        }
        if (source.CreationTime != null) {
            this.CreationTime = new String(source.CreationTime);
        }
        if (source.LastUpdatedTime != null) {
            this.LastUpdatedTime = new String(source.LastUpdatedTime);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AliasId", this.AliasId);
        this.setParamSimple(map, prefix + "AliasArn", this.AliasArn);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamObj(map, prefix + "RoutingStrategy.", this.RoutingStrategy);
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamSimple(map, prefix + "LastUpdatedTime", this.LastUpdatedTime);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

