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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFolderResponse extends AbstractModel {

    /**
    * folder id
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * folder name
    */
    @SerializedName("FolderName")
    @Expose
    private String FolderName;

    /**
    * 父文件夹id
    */
    @SerializedName("ParentId")
    @Expose
    private String ParentId;

    /**
    * 文件夹类型
    */
    @SerializedName("FolderType")
    @Expose
    private Long FolderType;

    /**
    * workspace id
    */
    @SerializedName("WorkSpaceId")
    @Expose
    private String WorkSpaceId;

    /**
    * 子文件夹信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubFolderInfo")
    @Expose
    private SubFolderInfo [] SubFolderInfo;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get folder id 
     * @return FolderId folder id
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set folder id
     * @param FolderId folder id
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

    /**
     * Get folder name 
     * @return FolderName folder name
     */
    public String getFolderName() {
        return this.FolderName;
    }

    /**
     * Set folder name
     * @param FolderName folder name
     */
    public void setFolderName(String FolderName) {
        this.FolderName = FolderName;
    }

    /**
     * Get 父文件夹id 
     * @return ParentId 父文件夹id
     */
    public String getParentId() {
        return this.ParentId;
    }

    /**
     * Set 父文件夹id
     * @param ParentId 父文件夹id
     */
    public void setParentId(String ParentId) {
        this.ParentId = ParentId;
    }

    /**
     * Get 文件夹类型 
     * @return FolderType 文件夹类型
     */
    public Long getFolderType() {
        return this.FolderType;
    }

    /**
     * Set 文件夹类型
     * @param FolderType 文件夹类型
     */
    public void setFolderType(Long FolderType) {
        this.FolderType = FolderType;
    }

    /**
     * Get workspace id 
     * @return WorkSpaceId workspace id
     */
    public String getWorkSpaceId() {
        return this.WorkSpaceId;
    }

    /**
     * Set workspace id
     * @param WorkSpaceId workspace id
     */
    public void setWorkSpaceId(String WorkSpaceId) {
        this.WorkSpaceId = WorkSpaceId;
    }

    /**
     * Get 子文件夹信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubFolderInfo 子文件夹信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SubFolderInfo [] getSubFolderInfo() {
        return this.SubFolderInfo;
    }

    /**
     * Set 子文件夹信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubFolderInfo 子文件夹信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubFolderInfo(SubFolderInfo [] SubFolderInfo) {
        this.SubFolderInfo = SubFolderInfo;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeFolderResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFolderResponse(DescribeFolderResponse source) {
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
        if (source.FolderName != null) {
            this.FolderName = new String(source.FolderName);
        }
        if (source.ParentId != null) {
            this.ParentId = new String(source.ParentId);
        }
        if (source.FolderType != null) {
            this.FolderType = new Long(source.FolderType);
        }
        if (source.WorkSpaceId != null) {
            this.WorkSpaceId = new String(source.WorkSpaceId);
        }
        if (source.SubFolderInfo != null) {
            this.SubFolderInfo = new SubFolderInfo[source.SubFolderInfo.length];
            for (int i = 0; i < source.SubFolderInfo.length; i++) {
                this.SubFolderInfo[i] = new SubFolderInfo(source.SubFolderInfo[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamSimple(map, prefix + "FolderName", this.FolderName);
        this.setParamSimple(map, prefix + "ParentId", this.ParentId);
        this.setParamSimple(map, prefix + "FolderType", this.FolderType);
        this.setParamSimple(map, prefix + "WorkSpaceId", this.WorkSpaceId);
        this.setParamArrayObj(map, prefix + "SubFolderInfo.", this.SubFolderInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

