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

public class UploadInfo  extends AbstractModel{

    /**
    * 文件所有分片数
    */
    @SerializedName("AllSliceNum")
    @Expose
    private Integer AllSliceNum;

    /**
    * 已完成分片数
    */
    @SerializedName("CompleteNum")
    @Expose
    private Integer CompleteNum;

    /**
     * 获取文件所有分片数
     * @return AllSliceNum 文件所有分片数
     */
    public Integer getAllSliceNum() {
        return this.AllSliceNum;
    }

    /**
     * 设置文件所有分片数
     * @param AllSliceNum 文件所有分片数
     */
    public void setAllSliceNum(Integer AllSliceNum) {
        this.AllSliceNum = AllSliceNum;
    }

    /**
     * 获取已完成分片数
     * @return CompleteNum 已完成分片数
     */
    public Integer getCompleteNum() {
        return this.CompleteNum;
    }

    /**
     * 设置已完成分片数
     * @param CompleteNum 已完成分片数
     */
    public void setCompleteNum(Integer CompleteNum) {
        this.CompleteNum = CompleteNum;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AllSliceNum", this.AllSliceNum);
        this.setParamSimple(map, prefix + "CompleteNum", this.CompleteNum);

    }
}

