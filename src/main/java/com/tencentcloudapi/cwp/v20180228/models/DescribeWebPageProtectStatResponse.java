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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeWebPageProtectStatResponse extends AbstractModel{

    /**
    * 文件篡改信息
    */
    @SerializedName("FileTamperNum")
    @Expose
    private ProtectStat [] FileTamperNum;

    /**
    * 防护文件分类信息
    */
    @SerializedName("ProtectFileType")
    @Expose
    private ProtectStat [] ProtectFileType;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 文件篡改信息 
     * @return FileTamperNum 文件篡改信息
     */
    public ProtectStat [] getFileTamperNum() {
        return this.FileTamperNum;
    }

    /**
     * Set 文件篡改信息
     * @param FileTamperNum 文件篡改信息
     */
    public void setFileTamperNum(ProtectStat [] FileTamperNum) {
        this.FileTamperNum = FileTamperNum;
    }

    /**
     * Get 防护文件分类信息 
     * @return ProtectFileType 防护文件分类信息
     */
    public ProtectStat [] getProtectFileType() {
        return this.ProtectFileType;
    }

    /**
     * Set 防护文件分类信息
     * @param ProtectFileType 防护文件分类信息
     */
    public void setProtectFileType(ProtectStat [] ProtectFileType) {
        this.ProtectFileType = ProtectFileType;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeWebPageProtectStatResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWebPageProtectStatResponse(DescribeWebPageProtectStatResponse source) {
        if (source.FileTamperNum != null) {
            this.FileTamperNum = new ProtectStat[source.FileTamperNum.length];
            for (int i = 0; i < source.FileTamperNum.length; i++) {
                this.FileTamperNum[i] = new ProtectStat(source.FileTamperNum[i]);
            }
        }
        if (source.ProtectFileType != null) {
            this.ProtectFileType = new ProtectStat[source.ProtectFileType.length];
            for (int i = 0; i < source.ProtectFileType.length; i++) {
                this.ProtectFileType[i] = new ProtectStat(source.ProtectFileType[i]);
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
        this.setParamArrayObj(map, prefix + "FileTamperNum.", this.FileTamperNum);
        this.setParamArrayObj(map, prefix + "ProtectFileType.", this.ProtectFileType);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

