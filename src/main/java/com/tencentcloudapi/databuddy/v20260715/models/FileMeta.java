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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FileMeta extends AbstractModel {

    /**
    * <p>文件id</p>
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * <p>文件/文件夹名称</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>文件类型</p>
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * <p>创建时间，毫秒秒级时间戳</p><p>参数格式：时间戳</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>更新时间</p><p>参数格式：时间戳字符串</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>acl权限类型</p>
    */
    @SerializedName("AllowActions")
    @Expose
    private String [] AllowActions;

    /**
    * <p>是否收藏</p>
    */
    @SerializedName("IsFavorite")
    @Expose
    private Boolean IsFavorite;

    /**
    * <p>文件path</p>
    */
    @SerializedName("PathName")
    @Expose
    private String PathName;

    /**
    * <p>是否系统创建</p>
    */
    @SerializedName("IsSystemGenerated")
    @Expose
    private Boolean IsSystemGenerated;

    /**
     * Get <p>文件id</p> 
     * @return FileId <p>文件id</p>
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set <p>文件id</p>
     * @param FileId <p>文件id</p>
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get <p>文件/文件夹名称</p> 
     * @return FileName <p>文件/文件夹名称</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>文件/文件夹名称</p>
     * @param FileName <p>文件/文件夹名称</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>文件类型</p> 
     * @return FileType <p>文件类型</p>
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set <p>文件类型</p>
     * @param FileType <p>文件类型</p>
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get <p>创建时间，毫秒秒级时间戳</p><p>参数格式：时间戳</p> 
     * @return CreateTime <p>创建时间，毫秒秒级时间戳</p><p>参数格式：时间戳</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间，毫秒秒级时间戳</p><p>参数格式：时间戳</p>
     * @param CreateTime <p>创建时间，毫秒秒级时间戳</p><p>参数格式：时间戳</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间</p><p>参数格式：时间戳字符串</p> 
     * @return UpdateTime <p>更新时间</p><p>参数格式：时间戳字符串</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p><p>参数格式：时间戳字符串</p>
     * @param UpdateTime <p>更新时间</p><p>参数格式：时间戳字符串</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>acl权限类型</p> 
     * @return AllowActions <p>acl权限类型</p>
     */
    public String [] getAllowActions() {
        return this.AllowActions;
    }

    /**
     * Set <p>acl权限类型</p>
     * @param AllowActions <p>acl权限类型</p>
     */
    public void setAllowActions(String [] AllowActions) {
        this.AllowActions = AllowActions;
    }

    /**
     * Get <p>是否收藏</p> 
     * @return IsFavorite <p>是否收藏</p>
     */
    public Boolean getIsFavorite() {
        return this.IsFavorite;
    }

    /**
     * Set <p>是否收藏</p>
     * @param IsFavorite <p>是否收藏</p>
     */
    public void setIsFavorite(Boolean IsFavorite) {
        this.IsFavorite = IsFavorite;
    }

    /**
     * Get <p>文件path</p> 
     * @return PathName <p>文件path</p>
     */
    public String getPathName() {
        return this.PathName;
    }

    /**
     * Set <p>文件path</p>
     * @param PathName <p>文件path</p>
     */
    public void setPathName(String PathName) {
        this.PathName = PathName;
    }

    /**
     * Get <p>是否系统创建</p> 
     * @return IsSystemGenerated <p>是否系统创建</p>
     */
    public Boolean getIsSystemGenerated() {
        return this.IsSystemGenerated;
    }

    /**
     * Set <p>是否系统创建</p>
     * @param IsSystemGenerated <p>是否系统创建</p>
     */
    public void setIsSystemGenerated(Boolean IsSystemGenerated) {
        this.IsSystemGenerated = IsSystemGenerated;
    }

    public FileMeta() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileMeta(FileMeta source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.AllowActions != null) {
            this.AllowActions = new String[source.AllowActions.length];
            for (int i = 0; i < source.AllowActions.length; i++) {
                this.AllowActions[i] = new String(source.AllowActions[i]);
            }
        }
        if (source.IsFavorite != null) {
            this.IsFavorite = new Boolean(source.IsFavorite);
        }
        if (source.PathName != null) {
            this.PathName = new String(source.PathName);
        }
        if (source.IsSystemGenerated != null) {
            this.IsSystemGenerated = new Boolean(source.IsSystemGenerated);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamArraySimple(map, prefix + "AllowActions.", this.AllowActions);
        this.setParamSimple(map, prefix + "IsFavorite", this.IsFavorite);
        this.setParamSimple(map, prefix + "PathName", this.PathName);
        this.setParamSimple(map, prefix + "IsSystemGenerated", this.IsSystemGenerated);

    }
}

