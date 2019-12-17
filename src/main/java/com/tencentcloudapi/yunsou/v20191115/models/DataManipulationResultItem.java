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
package com.tencentcloudapi.yunsou.v20191115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataManipulationResultItem extends AbstractModel{

    /**
    * 结果
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * 文档ID
    */
    @SerializedName("DocId")
    @Expose
    private String DocId;

    /**
    * 错误码
    */
    @SerializedName("Errno")
    @Expose
    private Long Errno;

    /**
     * Get 结果 
     * @return Result 结果
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 结果
     * @param Result 结果
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get 文档ID 
     * @return DocId 文档ID
     */
    public String getDocId() {
        return this.DocId;
    }

    /**
     * Set 文档ID
     * @param DocId 文档ID
     */
    public void setDocId(String DocId) {
        this.DocId = DocId;
    }

    /**
     * Get 错误码 
     * @return Errno 错误码
     */
    public Long getErrno() {
        return this.Errno;
    }

    /**
     * Set 错误码
     * @param Errno 错误码
     */
    public void setErrno(Long Errno) {
        this.Errno = Errno;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "DocId", this.DocId);
        this.setParamSimple(map, prefix + "Errno", this.Errno);

    }
}

