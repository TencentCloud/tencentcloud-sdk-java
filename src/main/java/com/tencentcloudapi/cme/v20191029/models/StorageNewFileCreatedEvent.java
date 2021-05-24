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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StorageNewFileCreatedEvent extends AbstractModel{

    /**
    * 云点播文件  Id。
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 媒体 Id。
    */
    @SerializedName("MaterialId")
    @Expose
    private String MaterialId;

    /**
    * 操作者 Id。
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 操作类型，可取值为：
<li>Upload：上传；</li>
<li>PullUpload：拉取上传；</li>
<li>Record：直播录制。</li>
    */
    @SerializedName("OperationType")
    @Expose
    private String OperationType;

    /**
    * 媒体归属。
    */
    @SerializedName("Owner")
    @Expose
    private Entity Owner;

    /**
    * 媒体分类路径。
    */
    @SerializedName("ClassPath")
    @Expose
    private String ClassPath;

    /**
     * Get 云点播文件  Id。 
     * @return FileId 云点播文件  Id。
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 云点播文件  Id。
     * @param FileId 云点播文件  Id。
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get 媒体 Id。 
     * @return MaterialId 媒体 Id。
     */
    public String getMaterialId() {
        return this.MaterialId;
    }

    /**
     * Set 媒体 Id。
     * @param MaterialId 媒体 Id。
     */
    public void setMaterialId(String MaterialId) {
        this.MaterialId = MaterialId;
    }

    /**
     * Get 操作者 Id。 
     * @return Operator 操作者 Id。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者 Id。
     * @param Operator 操作者 Id。
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 操作类型，可取值为：
<li>Upload：上传；</li>
<li>PullUpload：拉取上传；</li>
<li>Record：直播录制。</li> 
     * @return OperationType 操作类型，可取值为：
<li>Upload：上传；</li>
<li>PullUpload：拉取上传；</li>
<li>Record：直播录制。</li>
     */
    public String getOperationType() {
        return this.OperationType;
    }

    /**
     * Set 操作类型，可取值为：
<li>Upload：上传；</li>
<li>PullUpload：拉取上传；</li>
<li>Record：直播录制。</li>
     * @param OperationType 操作类型，可取值为：
<li>Upload：上传；</li>
<li>PullUpload：拉取上传；</li>
<li>Record：直播录制。</li>
     */
    public void setOperationType(String OperationType) {
        this.OperationType = OperationType;
    }

    /**
     * Get 媒体归属。 
     * @return Owner 媒体归属。
     */
    public Entity getOwner() {
        return this.Owner;
    }

    /**
     * Set 媒体归属。
     * @param Owner 媒体归属。
     */
    public void setOwner(Entity Owner) {
        this.Owner = Owner;
    }

    /**
     * Get 媒体分类路径。 
     * @return ClassPath 媒体分类路径。
     */
    public String getClassPath() {
        return this.ClassPath;
    }

    /**
     * Set 媒体分类路径。
     * @param ClassPath 媒体分类路径。
     */
    public void setClassPath(String ClassPath) {
        this.ClassPath = ClassPath;
    }

    public StorageNewFileCreatedEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StorageNewFileCreatedEvent(StorageNewFileCreatedEvent source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.MaterialId != null) {
            this.MaterialId = new String(source.MaterialId);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.OperationType != null) {
            this.OperationType = new String(source.OperationType);
        }
        if (source.Owner != null) {
            this.Owner = new Entity(source.Owner);
        }
        if (source.ClassPath != null) {
            this.ClassPath = new String(source.ClassPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "MaterialId", this.MaterialId);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "OperationType", this.OperationType);
        this.setParamObj(map, prefix + "Owner.", this.Owner);
        this.setParamSimple(map, prefix + "ClassPath", this.ClassPath);

    }
}

