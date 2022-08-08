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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFolderWorkflowListRequest extends AbstractModel{

    /**
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 父文件夹ID
    */
    @SerializedName("ParentsFolderId")
    @Expose
    private String ParentsFolderId;

    /**
    * 关键字
    */
    @SerializedName("KeyWords")
    @Expose
    private String KeyWords;

    /**
    * 页码，默认1
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 页大小，默认10
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get 项目Id 
     * @return ProjectId 项目Id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目Id
     * @param ProjectId 项目Id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 父文件夹ID 
     * @return ParentsFolderId 父文件夹ID
     */
    public String getParentsFolderId() {
        return this.ParentsFolderId;
    }

    /**
     * Set 父文件夹ID
     * @param ParentsFolderId 父文件夹ID
     */
    public void setParentsFolderId(String ParentsFolderId) {
        this.ParentsFolderId = ParentsFolderId;
    }

    /**
     * Get 关键字 
     * @return KeyWords 关键字
     */
    public String getKeyWords() {
        return this.KeyWords;
    }

    /**
     * Set 关键字
     * @param KeyWords 关键字
     */
    public void setKeyWords(String KeyWords) {
        this.KeyWords = KeyWords;
    }

    /**
     * Get 页码，默认1 
     * @return PageNumber 页码，默认1
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页码，默认1
     * @param PageNumber 页码，默认1
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 页大小，默认10 
     * @return PageSize 页大小，默认10
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 页大小，默认10
     * @param PageSize 页大小，默认10
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public DescribeFolderWorkflowListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFolderWorkflowListRequest(DescribeFolderWorkflowListRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ParentsFolderId != null) {
            this.ParentsFolderId = new String(source.ParentsFolderId);
        }
        if (source.KeyWords != null) {
            this.KeyWords = new String(source.KeyWords);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ParentsFolderId", this.ParentsFolderId);
        this.setParamSimple(map, prefix + "KeyWords", this.KeyWords);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

