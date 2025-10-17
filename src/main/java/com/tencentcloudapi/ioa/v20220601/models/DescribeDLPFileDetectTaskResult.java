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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDLPFileDetectTaskResult extends AbstractModel {

    /**
    * 提交任务时的文件md5
    */
    @SerializedName("FileMd5")
    @Expose
    private String FileMd5;

    /**
    * 提交任务时的文件名
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 检测执行状态：0未执行 1等待执行 2执行中 3执行失败 4执行完成 
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    *     FileAbstract:文件摘要
    FileAttr:文件属性
    FileCategory:命中分级分类 array
    FileContent:命中信息json(array)
	            RuleId:规则Id
				RuleName:规则名称
				RuleLevel:规则等级
				Hits：命中词库内容
				    LibraryId：词库Id
					LibraryType:词库类型
					LibraryName:词库名称
					Attribute: 命中属性 doc.Content文件内容|doc.FileSize文件大小|doc.Name文件名|doc.Type文件类型
					String  待匹配内容
					Content 命中内容
                HitsTotal 规则命中次数
    FileMd5 文件ND5
    FileName 文件名
    FileSize 文件大小
    FileType 文件后缀
    FileTypeName 文件类型名称
    FinalDataLevel 命中最高等级
    NodeId 节点唯一Id
    NodeIp 节点IP
    NodeName 节点名称
    OperateTime 文件操作时间
    Url 文件下载Url
    */
    @SerializedName("DetectResult")
    @Expose
    private String DetectResult;

    /**
    * 检测执行状态描述
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get 提交任务时的文件md5 
     * @return FileMd5 提交任务时的文件md5
     */
    public String getFileMd5() {
        return this.FileMd5;
    }

    /**
     * Set 提交任务时的文件md5
     * @param FileMd5 提交任务时的文件md5
     */
    public void setFileMd5(String FileMd5) {
        this.FileMd5 = FileMd5;
    }

    /**
     * Get 提交任务时的文件名 
     * @return FileName 提交任务时的文件名
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 提交任务时的文件名
     * @param FileName 提交任务时的文件名
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 检测执行状态：0未执行 1等待执行 2执行中 3执行失败 4执行完成  
     * @return Status 检测执行状态：0未执行 1等待执行 2执行中 3执行失败 4执行完成 
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 检测执行状态：0未执行 1等待执行 2执行中 3执行失败 4执行完成 
     * @param Status 检测执行状态：0未执行 1等待执行 2执行中 3执行失败 4执行完成 
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get     FileAbstract:文件摘要
    FileAttr:文件属性
    FileCategory:命中分级分类 array
    FileContent:命中信息json(array)
	            RuleId:规则Id
				RuleName:规则名称
				RuleLevel:规则等级
				Hits：命中词库内容
				    LibraryId：词库Id
					LibraryType:词库类型
					LibraryName:词库名称
					Attribute: 命中属性 doc.Content文件内容|doc.FileSize文件大小|doc.Name文件名|doc.Type文件类型
					String  待匹配内容
					Content 命中内容
                HitsTotal 规则命中次数
    FileMd5 文件ND5
    FileName 文件名
    FileSize 文件大小
    FileType 文件后缀
    FileTypeName 文件类型名称
    FinalDataLevel 命中最高等级
    NodeId 节点唯一Id
    NodeIp 节点IP
    NodeName 节点名称
    OperateTime 文件操作时间
    Url 文件下载Url 
     * @return DetectResult     FileAbstract:文件摘要
    FileAttr:文件属性
    FileCategory:命中分级分类 array
    FileContent:命中信息json(array)
	            RuleId:规则Id
				RuleName:规则名称
				RuleLevel:规则等级
				Hits：命中词库内容
				    LibraryId：词库Id
					LibraryType:词库类型
					LibraryName:词库名称
					Attribute: 命中属性 doc.Content文件内容|doc.FileSize文件大小|doc.Name文件名|doc.Type文件类型
					String  待匹配内容
					Content 命中内容
                HitsTotal 规则命中次数
    FileMd5 文件ND5
    FileName 文件名
    FileSize 文件大小
    FileType 文件后缀
    FileTypeName 文件类型名称
    FinalDataLevel 命中最高等级
    NodeId 节点唯一Id
    NodeIp 节点IP
    NodeName 节点名称
    OperateTime 文件操作时间
    Url 文件下载Url
     */
    public String getDetectResult() {
        return this.DetectResult;
    }

    /**
     * Set     FileAbstract:文件摘要
    FileAttr:文件属性
    FileCategory:命中分级分类 array
    FileContent:命中信息json(array)
	            RuleId:规则Id
				RuleName:规则名称
				RuleLevel:规则等级
				Hits：命中词库内容
				    LibraryId：词库Id
					LibraryType:词库类型
					LibraryName:词库名称
					Attribute: 命中属性 doc.Content文件内容|doc.FileSize文件大小|doc.Name文件名|doc.Type文件类型
					String  待匹配内容
					Content 命中内容
                HitsTotal 规则命中次数
    FileMd5 文件ND5
    FileName 文件名
    FileSize 文件大小
    FileType 文件后缀
    FileTypeName 文件类型名称
    FinalDataLevel 命中最高等级
    NodeId 节点唯一Id
    NodeIp 节点IP
    NodeName 节点名称
    OperateTime 文件操作时间
    Url 文件下载Url
     * @param DetectResult     FileAbstract:文件摘要
    FileAttr:文件属性
    FileCategory:命中分级分类 array
    FileContent:命中信息json(array)
	            RuleId:规则Id
				RuleName:规则名称
				RuleLevel:规则等级
				Hits：命中词库内容
				    LibraryId：词库Id
					LibraryType:词库类型
					LibraryName:词库名称
					Attribute: 命中属性 doc.Content文件内容|doc.FileSize文件大小|doc.Name文件名|doc.Type文件类型
					String  待匹配内容
					Content 命中内容
                HitsTotal 规则命中次数
    FileMd5 文件ND5
    FileName 文件名
    FileSize 文件大小
    FileType 文件后缀
    FileTypeName 文件类型名称
    FinalDataLevel 命中最高等级
    NodeId 节点唯一Id
    NodeIp 节点IP
    NodeName 节点名称
    OperateTime 文件操作时间
    Url 文件下载Url
     */
    public void setDetectResult(String DetectResult) {
        this.DetectResult = DetectResult;
    }

    /**
     * Get 检测执行状态描述 
     * @return Message 检测执行状态描述
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 检测执行状态描述
     * @param Message 检测执行状态描述
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public DescribeDLPFileDetectTaskResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDLPFileDetectTaskResult(DescribeDLPFileDetectTaskResult source) {
        if (source.FileMd5 != null) {
            this.FileMd5 = new String(source.FileMd5);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.DetectResult != null) {
            this.DetectResult = new String(source.DetectResult);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileMd5", this.FileMd5);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "DetectResult", this.DetectResult);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

