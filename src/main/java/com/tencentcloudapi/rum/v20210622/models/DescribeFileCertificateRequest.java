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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFileCertificateRequest extends AbstractModel {

    /**
    * 超时时间，不填默认是 5 分钟
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * bucket类型，不填默认1:web，2:app
    */
    @SerializedName("FileType")
    @Expose
    private Long FileType;

    /**
    * ProjectID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * reigon对应的id
    */
    @SerializedName("RegionID")
    @Expose
    private Long RegionID;

    /**
     * Get 超时时间，不填默认是 5 分钟 
     * @return Timeout 超时时间，不填默认是 5 分钟
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set 超时时间，不填默认是 5 分钟
     * @param Timeout 超时时间，不填默认是 5 分钟
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get bucket类型，不填默认1:web，2:app 
     * @return FileType bucket类型，不填默认1:web，2:app
     */
    public Long getFileType() {
        return this.FileType;
    }

    /**
     * Set bucket类型，不填默认1:web，2:app
     * @param FileType bucket类型，不填默认1:web，2:app
     */
    public void setFileType(Long FileType) {
        this.FileType = FileType;
    }

    /**
     * Get ProjectID 
     * @return ID ProjectID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set ProjectID
     * @param ID ProjectID
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get reigon对应的id 
     * @return RegionID reigon对应的id
     */
    public Long getRegionID() {
        return this.RegionID;
    }

    /**
     * Set reigon对应的id
     * @param RegionID reigon对应的id
     */
    public void setRegionID(Long RegionID) {
        this.RegionID = RegionID;
    }

    public DescribeFileCertificateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFileCertificateRequest(DescribeFileCertificateRequest source) {
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.FileType != null) {
            this.FileType = new Long(source.FileType);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.RegionID != null) {
            this.RegionID = new Long(source.RegionID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "RegionID", this.RegionID);

    }
}

