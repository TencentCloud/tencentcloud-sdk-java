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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KongServicePreview extends AbstractModel {

    /**
    * <p>服务ID</p>
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * <p>服务名字</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>标签</p>
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * <p>后端配置</p>
    */
    @SerializedName("UpstreamInfo")
    @Expose
    private KongUpstreamInfo UpstreamInfo;

    /**
    * <p>后端类型</p>
    */
    @SerializedName("UpstreamType")
    @Expose
    private String UpstreamType;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * <p>是否可编辑</p>
    */
    @SerializedName("Editable")
    @Expose
    private Boolean Editable;

    /**
    * <p>请求路径</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
     * Get <p>服务ID</p> 
     * @return ID <p>服务ID</p>
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set <p>服务ID</p>
     * @param ID <p>服务ID</p>
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get <p>服务名字</p> 
     * @return Name <p>服务名字</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>服务名字</p>
     * @param Name <p>服务名字</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>标签</p> 
     * @return Tags <p>标签</p>
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签</p>
     * @param Tags <p>标签</p>
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>后端配置</p> 
     * @return UpstreamInfo <p>后端配置</p>
     */
    public KongUpstreamInfo getUpstreamInfo() {
        return this.UpstreamInfo;
    }

    /**
     * Set <p>后端配置</p>
     * @param UpstreamInfo <p>后端配置</p>
     */
    public void setUpstreamInfo(KongUpstreamInfo UpstreamInfo) {
        this.UpstreamInfo = UpstreamInfo;
    }

    /**
     * Get <p>后端类型</p> 
     * @return UpstreamType <p>后端类型</p>
     */
    public String getUpstreamType() {
        return this.UpstreamType;
    }

    /**
     * Set <p>后端类型</p>
     * @param UpstreamType <p>后端类型</p>
     */
    public void setUpstreamType(String UpstreamType) {
        this.UpstreamType = UpstreamType;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreatedTime <p>创建时间</p>
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreatedTime <p>创建时间</p>
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get <p>是否可编辑</p> 
     * @return Editable <p>是否可编辑</p>
     */
    public Boolean getEditable() {
        return this.Editable;
    }

    /**
     * Set <p>是否可编辑</p>
     * @param Editable <p>是否可编辑</p>
     */
    public void setEditable(Boolean Editable) {
        this.Editable = Editable;
    }

    /**
     * Get <p>请求路径</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Path <p>请求路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>请求路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Path <p>请求路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    public KongServicePreview() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KongServicePreview(KongServicePreview source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.UpstreamInfo != null) {
            this.UpstreamInfo = new KongUpstreamInfo(source.UpstreamInfo);
        }
        if (source.UpstreamType != null) {
            this.UpstreamType = new String(source.UpstreamType);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.Editable != null) {
            this.Editable = new Boolean(source.Editable);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "UpstreamInfo.", this.UpstreamInfo);
        this.setParamSimple(map, prefix + "UpstreamType", this.UpstreamType);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "Editable", this.Editable);
        this.setParamSimple(map, prefix + "Path", this.Path);

    }
}

