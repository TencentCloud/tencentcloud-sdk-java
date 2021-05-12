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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScdnLogTaskDetail extends AbstractModel{

    /**
    * scdn域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 防护类型
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 查询任务开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 查询任务结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 任务创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 日志包下载链接
成功返回下载链接，其他情况返回'-'
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DownloadUrl")
    @Expose
    private String DownloadUrl;

    /**
    * 任务状态
created->任务已经创建
processing->任务正在执行
done->任务执行成功
failed->任务执行失败
no-log->没有日志产生
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 日志任务唯一id
    */
    @SerializedName("TaskID")
    @Expose
    private String TaskID;

    /**
    * 攻击类型, 可以为"all"
AttackType映射如下:
  other = '未知类型'
  malicious_scan = "恶意扫描"
  sql_inject = "SQL注入攻击"
  xss = "XSS攻击"
  cmd_inject = "命令注入攻击"
  ldap_inject = "LDAP注入攻击"
  ssi_inject = "SSI注入攻击"
  xml_inject = "XML注入攻击"
  web_service = "WEB服务漏洞攻击"
  web_app = "WEB应用漏洞攻击"
  path_traversal = "路径跨越攻击"
  illegal_access_core_file = "核心文件非法访问"
  file_upload = "文件上传攻击"
  trojan_horse = "木马后门攻击"
  csrf = "CSRF攻击"
  custom_policy = "自定义策略"
  ai_engine= 'AI引擎检出'
  malicious_file_upload= '恶意文件上传'
    */
    @SerializedName("AttackType")
    @Expose
    private String AttackType;

    /**
    * 防御模式,可以为"all"
DefenceMode映射如下：
  observe = '观察模式'
  intercept = '防御模式'
    */
    @SerializedName("DefenceMode")
    @Expose
    private String DefenceMode;

    /**
    * 查询条件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Conditions")
    @Expose
    private ScdnEventLogConditions [] Conditions;

    /**
    * mainland或overseas
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
     * Get scdn域名 
     * @return Domain scdn域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set scdn域名
     * @param Domain scdn域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 防护类型 
     * @return Mode 防护类型
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 防护类型
     * @param Mode 防护类型
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 查询任务开始时间 
     * @return StartTime 查询任务开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询任务开始时间
     * @param StartTime 查询任务开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询任务结束时间 
     * @return EndTime 查询任务结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询任务结束时间
     * @param EndTime 查询任务结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 任务创建时间 
     * @return CreateTime 任务创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 任务创建时间
     * @param CreateTime 任务创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 日志包下载链接
成功返回下载链接，其他情况返回'-'
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DownloadUrl 日志包下载链接
成功返回下载链接，其他情况返回'-'
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDownloadUrl() {
        return this.DownloadUrl;
    }

    /**
     * Set 日志包下载链接
成功返回下载链接，其他情况返回'-'
注意：此字段可能返回 null，表示取不到有效值。
     * @param DownloadUrl 日志包下载链接
成功返回下载链接，其他情况返回'-'
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDownloadUrl(String DownloadUrl) {
        this.DownloadUrl = DownloadUrl;
    }

    /**
     * Get 任务状态
created->任务已经创建
processing->任务正在执行
done->任务执行成功
failed->任务执行失败
no-log->没有日志产生 
     * @return Status 任务状态
created->任务已经创建
processing->任务正在执行
done->任务执行成功
failed->任务执行失败
no-log->没有日志产生
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态
created->任务已经创建
processing->任务正在执行
done->任务执行成功
failed->任务执行失败
no-log->没有日志产生
     * @param Status 任务状态
created->任务已经创建
processing->任务正在执行
done->任务执行成功
failed->任务执行失败
no-log->没有日志产生
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 日志任务唯一id 
     * @return TaskID 日志任务唯一id
     */
    public String getTaskID() {
        return this.TaskID;
    }

    /**
     * Set 日志任务唯一id
     * @param TaskID 日志任务唯一id
     */
    public void setTaskID(String TaskID) {
        this.TaskID = TaskID;
    }

    /**
     * Get 攻击类型, 可以为"all"
AttackType映射如下:
  other = '未知类型'
  malicious_scan = "恶意扫描"
  sql_inject = "SQL注入攻击"
  xss = "XSS攻击"
  cmd_inject = "命令注入攻击"
  ldap_inject = "LDAP注入攻击"
  ssi_inject = "SSI注入攻击"
  xml_inject = "XML注入攻击"
  web_service = "WEB服务漏洞攻击"
  web_app = "WEB应用漏洞攻击"
  path_traversal = "路径跨越攻击"
  illegal_access_core_file = "核心文件非法访问"
  file_upload = "文件上传攻击"
  trojan_horse = "木马后门攻击"
  csrf = "CSRF攻击"
  custom_policy = "自定义策略"
  ai_engine= 'AI引擎检出'
  malicious_file_upload= '恶意文件上传' 
     * @return AttackType 攻击类型, 可以为"all"
AttackType映射如下:
  other = '未知类型'
  malicious_scan = "恶意扫描"
  sql_inject = "SQL注入攻击"
  xss = "XSS攻击"
  cmd_inject = "命令注入攻击"
  ldap_inject = "LDAP注入攻击"
  ssi_inject = "SSI注入攻击"
  xml_inject = "XML注入攻击"
  web_service = "WEB服务漏洞攻击"
  web_app = "WEB应用漏洞攻击"
  path_traversal = "路径跨越攻击"
  illegal_access_core_file = "核心文件非法访问"
  file_upload = "文件上传攻击"
  trojan_horse = "木马后门攻击"
  csrf = "CSRF攻击"
  custom_policy = "自定义策略"
  ai_engine= 'AI引擎检出'
  malicious_file_upload= '恶意文件上传'
     */
    public String getAttackType() {
        return this.AttackType;
    }

    /**
     * Set 攻击类型, 可以为"all"
AttackType映射如下:
  other = '未知类型'
  malicious_scan = "恶意扫描"
  sql_inject = "SQL注入攻击"
  xss = "XSS攻击"
  cmd_inject = "命令注入攻击"
  ldap_inject = "LDAP注入攻击"
  ssi_inject = "SSI注入攻击"
  xml_inject = "XML注入攻击"
  web_service = "WEB服务漏洞攻击"
  web_app = "WEB应用漏洞攻击"
  path_traversal = "路径跨越攻击"
  illegal_access_core_file = "核心文件非法访问"
  file_upload = "文件上传攻击"
  trojan_horse = "木马后门攻击"
  csrf = "CSRF攻击"
  custom_policy = "自定义策略"
  ai_engine= 'AI引擎检出'
  malicious_file_upload= '恶意文件上传'
     * @param AttackType 攻击类型, 可以为"all"
AttackType映射如下:
  other = '未知类型'
  malicious_scan = "恶意扫描"
  sql_inject = "SQL注入攻击"
  xss = "XSS攻击"
  cmd_inject = "命令注入攻击"
  ldap_inject = "LDAP注入攻击"
  ssi_inject = "SSI注入攻击"
  xml_inject = "XML注入攻击"
  web_service = "WEB服务漏洞攻击"
  web_app = "WEB应用漏洞攻击"
  path_traversal = "路径跨越攻击"
  illegal_access_core_file = "核心文件非法访问"
  file_upload = "文件上传攻击"
  trojan_horse = "木马后门攻击"
  csrf = "CSRF攻击"
  custom_policy = "自定义策略"
  ai_engine= 'AI引擎检出'
  malicious_file_upload= '恶意文件上传'
     */
    public void setAttackType(String AttackType) {
        this.AttackType = AttackType;
    }

    /**
     * Get 防御模式,可以为"all"
DefenceMode映射如下：
  observe = '观察模式'
  intercept = '防御模式' 
     * @return DefenceMode 防御模式,可以为"all"
DefenceMode映射如下：
  observe = '观察模式'
  intercept = '防御模式'
     */
    public String getDefenceMode() {
        return this.DefenceMode;
    }

    /**
     * Set 防御模式,可以为"all"
DefenceMode映射如下：
  observe = '观察模式'
  intercept = '防御模式'
     * @param DefenceMode 防御模式,可以为"all"
DefenceMode映射如下：
  observe = '观察模式'
  intercept = '防御模式'
     */
    public void setDefenceMode(String DefenceMode) {
        this.DefenceMode = DefenceMode;
    }

    /**
     * Get 查询条件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Conditions 查询条件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ScdnEventLogConditions [] getConditions() {
        return this.Conditions;
    }

    /**
     * Set 查询条件
注意：此字段可能返回 null，表示取不到有效值。
     * @param Conditions 查询条件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConditions(ScdnEventLogConditions [] Conditions) {
        this.Conditions = Conditions;
    }

    /**
     * Get mainland或overseas
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Area mainland或overseas
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set mainland或overseas
注意：此字段可能返回 null，表示取不到有效值。
     * @param Area mainland或overseas
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    public ScdnLogTaskDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScdnLogTaskDetail(ScdnLogTaskDetail source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.DownloadUrl != null) {
            this.DownloadUrl = new String(source.DownloadUrl);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TaskID != null) {
            this.TaskID = new String(source.TaskID);
        }
        if (source.AttackType != null) {
            this.AttackType = new String(source.AttackType);
        }
        if (source.DefenceMode != null) {
            this.DefenceMode = new String(source.DefenceMode);
        }
        if (source.Conditions != null) {
            this.Conditions = new ScdnEventLogConditions[source.Conditions.length];
            for (int i = 0; i < source.Conditions.length; i++) {
                this.Conditions[i] = new ScdnEventLogConditions(source.Conditions[i]);
            }
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "DownloadUrl", this.DownloadUrl);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TaskID", this.TaskID);
        this.setParamSimple(map, prefix + "AttackType", this.AttackType);
        this.setParamSimple(map, prefix + "DefenceMode", this.DefenceMode);
        this.setParamArrayObj(map, prefix + "Conditions.", this.Conditions);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

