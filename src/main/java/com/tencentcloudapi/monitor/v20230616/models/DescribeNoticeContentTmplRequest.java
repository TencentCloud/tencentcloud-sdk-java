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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNoticeContentTmplRequest extends AbstractModel {

    /**
    * 分页数
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 分页大小
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 指定模板ID查询，查询参数都为空则默认查询账号下所有模板
    */
    @SerializedName("TmplIDs")
    @Expose
    private String [] TmplIDs;

    /**
    * 指定模板名称查询，查询参数都为空则默认查询账号下所有模板
    */
    @SerializedName("TmplName")
    @Expose
    private String TmplName;

    /**
    * 指定通知模板ID查询，查询参数都为空则默认查询账号下所有模板
    */
    @SerializedName("NoticeID")
    @Expose
    private String NoticeID;

    /**
    * 模板语言 en/zh 缺省不过滤
    */
    @SerializedName("TmplLanguage")
    @Expose
    private String TmplLanguage;

    /**
    * 监控类型
    */
    @SerializedName("MonitorType")
    @Expose
    private String MonitorType;

    /**
     * Get 分页数 
     * @return PageNumber 分页数
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 分页数
     * @param PageNumber 分页数
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 分页大小 
     * @return PageSize 分页大小
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页大小
     * @param PageSize 分页大小
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 指定模板ID查询，查询参数都为空则默认查询账号下所有模板 
     * @return TmplIDs 指定模板ID查询，查询参数都为空则默认查询账号下所有模板
     */
    public String [] getTmplIDs() {
        return this.TmplIDs;
    }

    /**
     * Set 指定模板ID查询，查询参数都为空则默认查询账号下所有模板
     * @param TmplIDs 指定模板ID查询，查询参数都为空则默认查询账号下所有模板
     */
    public void setTmplIDs(String [] TmplIDs) {
        this.TmplIDs = TmplIDs;
    }

    /**
     * Get 指定模板名称查询，查询参数都为空则默认查询账号下所有模板 
     * @return TmplName 指定模板名称查询，查询参数都为空则默认查询账号下所有模板
     */
    public String getTmplName() {
        return this.TmplName;
    }

    /**
     * Set 指定模板名称查询，查询参数都为空则默认查询账号下所有模板
     * @param TmplName 指定模板名称查询，查询参数都为空则默认查询账号下所有模板
     */
    public void setTmplName(String TmplName) {
        this.TmplName = TmplName;
    }

    /**
     * Get 指定通知模板ID查询，查询参数都为空则默认查询账号下所有模板 
     * @return NoticeID 指定通知模板ID查询，查询参数都为空则默认查询账号下所有模板
     */
    public String getNoticeID() {
        return this.NoticeID;
    }

    /**
     * Set 指定通知模板ID查询，查询参数都为空则默认查询账号下所有模板
     * @param NoticeID 指定通知模板ID查询，查询参数都为空则默认查询账号下所有模板
     */
    public void setNoticeID(String NoticeID) {
        this.NoticeID = NoticeID;
    }

    /**
     * Get 模板语言 en/zh 缺省不过滤 
     * @return TmplLanguage 模板语言 en/zh 缺省不过滤
     */
    public String getTmplLanguage() {
        return this.TmplLanguage;
    }

    /**
     * Set 模板语言 en/zh 缺省不过滤
     * @param TmplLanguage 模板语言 en/zh 缺省不过滤
     */
    public void setTmplLanguage(String TmplLanguage) {
        this.TmplLanguage = TmplLanguage;
    }

    /**
     * Get 监控类型 
     * @return MonitorType 监控类型
     */
    public String getMonitorType() {
        return this.MonitorType;
    }

    /**
     * Set 监控类型
     * @param MonitorType 监控类型
     */
    public void setMonitorType(String MonitorType) {
        this.MonitorType = MonitorType;
    }

    public DescribeNoticeContentTmplRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNoticeContentTmplRequest(DescribeNoticeContentTmplRequest source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.TmplIDs != null) {
            this.TmplIDs = new String[source.TmplIDs.length];
            for (int i = 0; i < source.TmplIDs.length; i++) {
                this.TmplIDs[i] = new String(source.TmplIDs[i]);
            }
        }
        if (source.TmplName != null) {
            this.TmplName = new String(source.TmplName);
        }
        if (source.NoticeID != null) {
            this.NoticeID = new String(source.NoticeID);
        }
        if (source.TmplLanguage != null) {
            this.TmplLanguage = new String(source.TmplLanguage);
        }
        if (source.MonitorType != null) {
            this.MonitorType = new String(source.MonitorType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArraySimple(map, prefix + "TmplIDs.", this.TmplIDs);
        this.setParamSimple(map, prefix + "TmplName", this.TmplName);
        this.setParamSimple(map, prefix + "NoticeID", this.NoticeID);
        this.setParamSimple(map, prefix + "TmplLanguage", this.TmplLanguage);
        this.setParamSimple(map, prefix + "MonitorType", this.MonitorType);

    }
}

