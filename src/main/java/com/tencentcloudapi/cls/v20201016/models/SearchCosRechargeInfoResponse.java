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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchCosRechargeInfoResponse extends AbstractModel {

    /**
    * 匹配到的存储桶下的某个文件的前几行数据
    */
    @SerializedName("Data")
    @Expose
    private String [] Data;

    /**
    * 匹配到的存储桶下的文件个数
    */
    @SerializedName("Sum")
    @Expose
    private Long Sum;

    /**
    * 当前预览文件路径
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 预览获取数据失败原因
    */
    @SerializedName("Msg")
    @Expose
    private String Msg;

    /**
    * 状态。
- 0：成功
- 10000：参数错误，请确认参数
- 10001：授权失败，请确认授权
- 10002：获取文件列表失败，请稍后再试。若无法解决，请联系智能客服或提交工单
- 10003：桶内无相应前缀文件，请使用正确的桶、文件前缀和压缩方式
- 10004：文件下载失败，请稍后再试。若无法解决，请联系智能客服或提交工单
- 10005：文件解压缩失败，请选择正确的压缩方式然后再试
- 10006：读取文件内容失败，请确认文件可读
- 10007：文件预览失败，请稍后再试。若无法解决，请联系智能客服或提交工单
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 匹配到的存储桶下的某个文件的前几行数据 
     * @return Data 匹配到的存储桶下的某个文件的前几行数据
     */
    public String [] getData() {
        return this.Data;
    }

    /**
     * Set 匹配到的存储桶下的某个文件的前几行数据
     * @param Data 匹配到的存储桶下的某个文件的前几行数据
     */
    public void setData(String [] Data) {
        this.Data = Data;
    }

    /**
     * Get 匹配到的存储桶下的文件个数 
     * @return Sum 匹配到的存储桶下的文件个数
     */
    public Long getSum() {
        return this.Sum;
    }

    /**
     * Set 匹配到的存储桶下的文件个数
     * @param Sum 匹配到的存储桶下的文件个数
     */
    public void setSum(Long Sum) {
        this.Sum = Sum;
    }

    /**
     * Get 当前预览文件路径 
     * @return Path 当前预览文件路径
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 当前预览文件路径
     * @param Path 当前预览文件路径
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 预览获取数据失败原因 
     * @return Msg 预览获取数据失败原因
     */
    public String getMsg() {
        return this.Msg;
    }

    /**
     * Set 预览获取数据失败原因
     * @param Msg 预览获取数据失败原因
     */
    public void setMsg(String Msg) {
        this.Msg = Msg;
    }

    /**
     * Get 状态。
- 0：成功
- 10000：参数错误，请确认参数
- 10001：授权失败，请确认授权
- 10002：获取文件列表失败，请稍后再试。若无法解决，请联系智能客服或提交工单
- 10003：桶内无相应前缀文件，请使用正确的桶、文件前缀和压缩方式
- 10004：文件下载失败，请稍后再试。若无法解决，请联系智能客服或提交工单
- 10005：文件解压缩失败，请选择正确的压缩方式然后再试
- 10006：读取文件内容失败，请确认文件可读
- 10007：文件预览失败，请稍后再试。若无法解决，请联系智能客服或提交工单 
     * @return Status 状态。
- 0：成功
- 10000：参数错误，请确认参数
- 10001：授权失败，请确认授权
- 10002：获取文件列表失败，请稍后再试。若无法解决，请联系智能客服或提交工单
- 10003：桶内无相应前缀文件，请使用正确的桶、文件前缀和压缩方式
- 10004：文件下载失败，请稍后再试。若无法解决，请联系智能客服或提交工单
- 10005：文件解压缩失败，请选择正确的压缩方式然后再试
- 10006：读取文件内容失败，请确认文件可读
- 10007：文件预览失败，请稍后再试。若无法解决，请联系智能客服或提交工单
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态。
- 0：成功
- 10000：参数错误，请确认参数
- 10001：授权失败，请确认授权
- 10002：获取文件列表失败，请稍后再试。若无法解决，请联系智能客服或提交工单
- 10003：桶内无相应前缀文件，请使用正确的桶、文件前缀和压缩方式
- 10004：文件下载失败，请稍后再试。若无法解决，请联系智能客服或提交工单
- 10005：文件解压缩失败，请选择正确的压缩方式然后再试
- 10006：读取文件内容失败，请确认文件可读
- 10007：文件预览失败，请稍后再试。若无法解决，请联系智能客服或提交工单
     * @param Status 状态。
- 0：成功
- 10000：参数错误，请确认参数
- 10001：授权失败，请确认授权
- 10002：获取文件列表失败，请稍后再试。若无法解决，请联系智能客服或提交工单
- 10003：桶内无相应前缀文件，请使用正确的桶、文件前缀和压缩方式
- 10004：文件下载失败，请稍后再试。若无法解决，请联系智能客服或提交工单
- 10005：文件解压缩失败，请选择正确的压缩方式然后再试
- 10006：读取文件内容失败，请确认文件可读
- 10007：文件预览失败，请稍后再试。若无法解决，请联系智能客服或提交工单
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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

    public SearchCosRechargeInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchCosRechargeInfoResponse(SearchCosRechargeInfoResponse source) {
        if (source.Data != null) {
            this.Data = new String[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new String(source.Data[i]);
            }
        }
        if (source.Sum != null) {
            this.Sum = new Long(source.Sum);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Msg != null) {
            this.Msg = new String(source.Msg);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "Sum", this.Sum);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Msg", this.Msg);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

