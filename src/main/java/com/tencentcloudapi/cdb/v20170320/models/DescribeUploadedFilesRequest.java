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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUploadedFilesRequest  extends AbstractModel{

    /**
    * 文件路径。该字段应填用户主账号的OwnerUin信息。
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 记录偏移量，默认值为0。
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * 单次请求返回的数量，默认值为20。
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
     * 获取文件路径。该字段应填用户主账号的OwnerUin信息。
     * @return Path 文件路径。该字段应填用户主账号的OwnerUin信息。
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * 设置文件路径。该字段应填用户主账号的OwnerUin信息。
     * @param Path 文件路径。该字段应填用户主账号的OwnerUin信息。
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * 获取记录偏移量，默认值为0。
     * @return Offset 记录偏移量，默认值为0。
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置记录偏移量，默认值为0。
     * @param Offset 记录偏移量，默认值为0。
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取单次请求返回的数量，默认值为20。
     * @return Limit 单次请求返回的数量，默认值为20。
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置单次请求返回的数量，默认值为20。
     * @param Limit 单次请求返回的数量，默认值为20。
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

