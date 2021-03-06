package com.tencent.smtt.sdk;

import android.content.Context;
import com.tencent.smtt.utils.TbsLog;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public abstract class TbsBaseConfig {
    public static final String TAG = "TbsBaseConfig";
    /* renamed from: a */
    Map<String, String> f13841a;
    /* renamed from: b */
    private Context f13842b;

    /* renamed from: a */
    private static File m49444a(Context context, String str) {
        C5813an.m8800a();
        File t = C5813an.m8819t(context);
        if (t == null) {
            return null;
        }
        File file = new File(t, str);
        if (file.exists()) {
            return file;
        }
        try {
            file.createNewFile();
            return file;
        } catch (IOException e) {
            return null;
        }
    }

    public void clear() {
        this.f13841a.clear();
        commit();
    }

    public synchronized void commit() {
        writeTbsDownloadInfo();
    }

    public abstract String getConfigFileName();

    public void init(Context context) {
        this.f13841a = new HashMap();
        this.f13842b = context.getApplicationContext();
        if (this.f13842b == null) {
            this.f13842b = context;
        }
        refreshSyncMap(context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x005a A:{SYNTHETIC, Splitter:B:27:0x005a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void refreshSyncMap(Context context) {
        Throwable th;
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2 = null;
        try {
            File a = m49444a(this.f13842b, getConfigFileName());
            if (a != null) {
                this.f13841a.clear();
                BufferedInputStream bufferedInputStream3 = new BufferedInputStream(new FileInputStream(a));
                try {
                    Properties properties = new Properties();
                    properties.load(bufferedInputStream3);
                    for (String str : properties.stringPropertyNames()) {
                        this.f13841a.put(str, properties.getProperty(str));
                    }
                    try {
                        bufferedInputStream3.close();
                    } catch (Exception e) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedInputStream = bufferedInputStream3;
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (Exception e2) {
                        }
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedInputStream = null;
            if (bufferedInputStream != null) {
            }
            throw th;
        }
        return;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a6 A:{SYNTHETIC, Splitter:B:39:0x00a6} */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ab A:{SYNTHETIC, Splitter:B:42:0x00ab} */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0077 A:{SYNTHETIC, Splitter:B:20:0x0077} */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007c A:{SYNTHETIC, Splitter:B:23:0x007c} */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a6 A:{SYNTHETIC, Splitter:B:39:0x00a6} */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ab A:{SYNTHETIC, Splitter:B:42:0x00ab} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void writeTbsDownloadInfo() {
        BufferedOutputStream bufferedOutputStream;
        Throwable th;
        BufferedOutputStream bufferedOutputStream2;
        TbsLog.m80434i(TAG, "writeTbsDownloadInfo #1");
        BufferedInputStream bufferedInputStream;
        try {
            File a = m49444a(this.f13842b, getConfigFileName());
            if (a != null) {
                Properties properties;
                bufferedInputStream = new BufferedInputStream(new FileInputStream(a));
                try {
                    properties = new Properties();
                    properties.load(bufferedInputStream);
                    properties.clear();
                    for (String str : this.f13841a.keySet()) {
                        Object obj = this.f13841a.get(str);
                        properties.setProperty(str, String.valueOf(obj));
                        TbsLog.m80434i(TAG, "writeTbsDownloadInfo key is " + str + " value is " + obj);
                    }
                    this.f13841a.clear();
                    bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(a));
                } catch (Throwable th2) {
                    th = th2;
                    bufferedOutputStream2 = null;
                    if (bufferedInputStream != null) {
                    }
                    if (bufferedOutputStream2 != null) {
                    }
                    throw th;
                }
                try {
                    properties.store(bufferedOutputStream, null);
                    try {
                        bufferedInputStream.close();
                    } catch (Exception e) {
                    }
                    try {
                        bufferedOutputStream.close();
                    } catch (Exception e2) {
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bufferedOutputStream2 = bufferedOutputStream;
                    if (bufferedInputStream != null) {
                    }
                    if (bufferedOutputStream2 != null) {
                    }
                    throw th;
                }
            }
        } catch (Throwable th22) {
            th = th22;
            bufferedOutputStream2 = null;
            bufferedInputStream = null;
            if (bufferedInputStream != null) {
                try {
                    bufferedInputStream.close();
                } catch (Exception e3) {
                }
            }
            if (bufferedOutputStream2 != null) {
                try {
                    bufferedOutputStream2.close();
                } catch (Exception e4) {
                }
            }
            throw th;
        }
        return;
    }
}
