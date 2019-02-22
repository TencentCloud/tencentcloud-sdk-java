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
package com.tencentcloudapi.iai.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateFaceResponse  extends AbstractModel{

    /**
    * 加入成功的人脸数量
    */
    @SerializedName("SucFaceNum")
    @Expose
    private Integer SucFaceNum;

    /**
    * 加入成功的人脸ID列表
    */
    @SerializedName("SucFaceIds")
    @Expose
    private String [] SucFaceIds;

    /**
    * 每张人脸图片添加结果，-1101 代表未检测到人脸，-1102 代表图片解码失败，其他非 0 值代表算法服务异常。
    */
    @SerializedName("RetCode")
    @Expose
    private Integer [] RetCode;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取加入成功的人脸数量
     * @return SucFaceNum 加入成功的人脸数量
     */
    public Integer getSucFaceNum() {
        return this.SucFaceNum;
    }

    /**
     * 设置加入成功的人脸数量
     * @param SucFaceNum 加入成功的人脸数量
     */
    public void setSucFaceNum(Integer SucFaceNum) {
        this.SucFaceNum = SucFaceNum;
    }

    /**
     * 获取加入成功的人脸ID列表
     * @return SucFaceIds 加入成功的人脸ID列表
     */
    public String [] getSucFaceIds() {
        return this.SucFaceIds;
    }

    /**
     * 设置加入成功的人脸ID列表
     * @param SucFaceIds 加入成功的人脸ID列表
     */
    public void setSucFaceIds(String [] SucFaceIds) {
        this.SucFaceIds = SucFaceIds;
    }

    /**
     * 获取每张人脸图片添加结果，-1101 代表未检测到人脸，-1102 代表图片解码失败，其他非 0 值代表算法服务异常。
     * @return RetCode 每张人脸图片添加结果，-1101 代表未检测到人脸，-1102 代表图片解码失败，其他非 0 值代表算法服务异常。
     */
    public Integer [] getRetCode() {
        return this.RetCode;
    }

    /**
     * 设置每张人脸图片添加结果，-1101 代表未检测到人脸，-1102 代表图片解码失败，其他非 0 值代表算法服务异常。
     * @param RetCode 每张人脸图片添加结果，-1101 代表未检测到人脸，-1102 代表图片解码失败，其他非 0 值代表算法服务异常。
     */
    public void setRetCode(Integer [] RetCode) {
        this.RetCode = RetCode;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SucFaceNum", this.SucFaceNum);
        this.setParamArraySimple(map, prefix + "SucFaceIds.", this.SucFaceIds);
        this.setParamArraySimple(map, prefix + "RetCode.", this.RetCode);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

