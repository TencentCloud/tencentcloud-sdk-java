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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CompareIdlFilesResponse extends AbstractModel{

    /**
    * 本次上传校验所有的IDL文件信息列表
    */
    @SerializedName("IdlFiles")
    @Expose
    private IdlFileInfo [] IdlFiles;

    /**
    * 本次校验合法的表格数量
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 读取IDL描述文件后,根据用户指示的所选中表格解析校验结果
    */
    @SerializedName("TableInfos")
    @Expose
    private ParsedTableInfoNew [] TableInfos;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 本次上传校验所有的IDL文件信息列表 
     * @return IdlFiles 本次上传校验所有的IDL文件信息列表
     */
    public IdlFileInfo [] getIdlFiles() {
        return this.IdlFiles;
    }

    /**
     * Set 本次上传校验所有的IDL文件信息列表
     * @param IdlFiles 本次上传校验所有的IDL文件信息列表
     */
    public void setIdlFiles(IdlFileInfo [] IdlFiles) {
        this.IdlFiles = IdlFiles;
    }

    /**
     * Get 本次校验合法的表格数量 
     * @return TotalCount 本次校验合法的表格数量
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 本次校验合法的表格数量
     * @param TotalCount 本次校验合法的表格数量
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 读取IDL描述文件后,根据用户指示的所选中表格解析校验结果 
     * @return TableInfos 读取IDL描述文件后,根据用户指示的所选中表格解析校验结果
     */
    public ParsedTableInfoNew [] getTableInfos() {
        return this.TableInfos;
    }

    /**
     * Set 读取IDL描述文件后,根据用户指示的所选中表格解析校验结果
     * @param TableInfos 读取IDL描述文件后,根据用户指示的所选中表格解析校验结果
     */
    public void setTableInfos(ParsedTableInfoNew [] TableInfos) {
        this.TableInfos = TableInfos;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "IdlFiles.", this.IdlFiles);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "TableInfos.", this.TableInfos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

