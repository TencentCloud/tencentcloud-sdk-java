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
package com.tencentcloudapi.bma.v20210624.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCRRightFileRequest extends AbstractModel{

    /**
    * xxx
    */
    @SerializedName("WorkId")
    @Expose
    private Long WorkId;

    /**
    * xxx
    */
    @SerializedName("FileList")
    @Expose
    private File [] FileList;

    /**
     * Get xxx 
     * @return WorkId xxx
     */
    public Long getWorkId() {
        return this.WorkId;
    }

    /**
     * Set xxx
     * @param WorkId xxx
     */
    public void setWorkId(Long WorkId) {
        this.WorkId = WorkId;
    }

    /**
     * Get xxx 
     * @return FileList xxx
     */
    public File [] getFileList() {
        return this.FileList;
    }

    /**
     * Set xxx
     * @param FileList xxx
     */
    public void setFileList(File [] FileList) {
        this.FileList = FileList;
    }

    public CreateCRRightFileRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCRRightFileRequest(CreateCRRightFileRequest source) {
        if (source.WorkId != null) {
            this.WorkId = new Long(source.WorkId);
        }
        if (source.FileList != null) {
            this.FileList = new File[source.FileList.length];
            for (int i = 0; i < source.FileList.length; i++) {
                this.FileList[i] = new File(source.FileList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkId", this.WorkId);
        this.setParamArrayObj(map, prefix + "FileList.", this.FileList);

    }
}

